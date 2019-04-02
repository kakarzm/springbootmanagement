package com.lm.service;

import com.github.pagehelper.PageInfo;
import com.lm.model.TEntityCourse;
import com.lm.vo.SimpleCourse;

import java.util.List;

public interface CourseService {
    Integer addEntity(TEntityCourse course);

    Integer updateEntity(TEntityCourse course);

    Integer updateStatue(String id);

    PageInfo getList(String keyword, Integer pageSize, Integer pageNumber);

    List<SimpleCourse> initMain();
}
