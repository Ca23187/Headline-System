package com.atguigu.headline.service;

import com.atguigu.headline.pojo.NewsUser;

public interface NewsUserService {
    /**
     * 根据用户登录的账号找用户信息的方法
     * @param username 用户输入的用户名
     * @return 找到则返回NewsUser对象，找不到则返回null
     */
    NewsUser findByUserName(String username);

    NewsUser findByUid(Integer uid);

    Integer registUser(NewsUser registUser);
}
