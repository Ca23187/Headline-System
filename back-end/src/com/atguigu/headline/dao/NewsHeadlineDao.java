package com.atguigu.headline.dao;

import com.atguigu.headline.pojo.NewsHeadline;
import com.atguigu.headline.pojo.vo.HeadlineDetailVo;
import com.atguigu.headline.pojo.vo.HeadlinePageVo;
import com.atguigu.headline.pojo.vo.HeadlineQueryVo;

import java.util.List;

public interface NewsHeadlineDao {
    int addNewsHeadline(NewsHeadline newsHeadline);

    List<HeadlinePageVo> findPageList(HeadlineQueryVo headlineQueryVo);

    int findPageCount(HeadlineQueryVo headlineQueryVo);

    int increasePageViews(int hid);

    HeadlineDetailVo findHeadlineDetail(int hid);

    NewsHeadline findByHid(int hid);

    int update(NewsHeadline newsHeadline);

    int removeByHid(int hid);
}
