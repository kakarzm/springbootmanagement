package com.lm.dao;

import com.lm.model.plan.basic.CourseB;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by iii on 2019/2/18.
 */
public interface BasicCourseMapper {
    int save(CourseB courseb);

    List<Map<String, String>> getList(@Param(value = "title") String title) ;

    int del(String id);

    CourseB searchid(String id);

    int update(CourseB courseB) ;
}
