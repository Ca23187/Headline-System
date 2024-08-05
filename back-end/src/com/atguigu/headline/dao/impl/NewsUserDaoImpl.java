package com.atguigu.headline.dao.impl;

import com.atguigu.headline.dao.BaseDao;
import com.atguigu.headline.dao.NewsUserDao;
import com.atguigu.headline.pojo.NewsType;
import com.atguigu.headline.pojo.NewsUser;

import java.util.List;

public class NewsUserDaoImpl extends BaseDao implements NewsUserDao {
    @Override
    public NewsUser findByUserName(String username) {
        String sql = "SELECT uid, username, user_pwd userPwd, nick_name nickName FROM news_user WHERE username = ?";
        List<NewsUser> list = baseQuery(NewsUser.class, sql, username);
        return list != null && list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public NewsUser findByUid(Integer uid) {
        String sql = "SELECT uid, username, user_pwd userPwd, nick_name nickName FROM news_user WHERE uid = ?";
        List<NewsUser> list = baseQuery(NewsUser.class, sql, uid);
        return list != null && list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public Integer insertUser(NewsUser registUser) {
        String sql = "INSERT INTO news_user VALUES (DEFAULT, ?, ?, ?)";
        return baseUpdate(sql, registUser.getUsername(), registUser.getUserPwd(), registUser.getNickName());
    }
}
