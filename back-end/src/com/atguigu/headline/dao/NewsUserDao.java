package com.atguigu.headline.dao;

import com.atguigu.headline.pojo.NewsUser;

public interface NewsUserDao {
    NewsUser findByUserName(String username);

    NewsUser findByUid(Integer uid);

    Integer insertUser(NewsUser registUser);
}
