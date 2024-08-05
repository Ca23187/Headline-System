package com.atguigu.headline.service.impl;

import com.atguigu.headline.dao.NewsUserDao;
import com.atguigu.headline.dao.impl.NewsUserDaoImpl;
import com.atguigu.headline.pojo.NewsUser;
import com.atguigu.headline.service.NewsUserService;
import com.atguigu.headline.util.MD5Util;

public class NewsUserServiceImpl implements NewsUserService {
    private NewsUserDao userDao = new NewsUserDaoImpl();
    @Override
    public NewsUser findByUserName(String username) {
        return userDao.findByUserName(username);
    }

    @Override
    public NewsUser findByUid(Integer uid) {
        return userDao.findByUid(uid);
    }

    @Override
    public Integer registUser(NewsUser registUser) {
        // 处理新增数据的业务
        // 用MD5将注册密码明文转密文
        registUser.setUserPwd(MD5Util.encrypt(registUser.getUserPwd()));
        return userDao.insertUser(registUser);
    }
}
