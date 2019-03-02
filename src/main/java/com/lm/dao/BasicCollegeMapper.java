package com.lm.dao;

import com.lm.model.plan.basic.CollegeB;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by iii on 2019/2/11.
 */

public interface BasicCollegeMapper {
    int save(CollegeB collegeb);

    int del(String id);

    int update(CollegeB collegeb) ;

    CollegeB searchid(String id);

    List<Map<String, String>> getList(@Param(value = "title") String title) ;
}
