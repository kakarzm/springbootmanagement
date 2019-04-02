package com.lm.service;

import com.lm.model.TEntityCourseType;
import com.lm.vo.SimpleCourseType;

import java.util.List;

public interface CourseTypeService {
    List<SimpleCourseType> loadData();

    TEntityCourseType get(String id);

    String[] getPath(String id);
}
