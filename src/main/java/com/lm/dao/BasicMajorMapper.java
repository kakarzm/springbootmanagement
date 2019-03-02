package com.lm.dao;

import com.lm.model.plan.basic.MajorBasic;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by iii on 2019/2/18.
 */
public interface BasicMajorMapper {
    int save(MajorBasic majorBasic);

    List<Map<String, String>> getList(@Param(value = "title") String title) ;

    int del(String id);

    MajorBasic searchid(String id);
    int update(MajorBasic majorBasic) ;

}
