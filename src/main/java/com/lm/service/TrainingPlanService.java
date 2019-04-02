package com.lm.service;

import com.github.pagehelper.PageInfo;
import com.lm.model.TEntityTrainingplan;

import java.util.List;

public interface TrainingPlanService {
    Integer addEntity(TEntityTrainingplan trainingplan);

    Integer updateEntity(TEntityTrainingplan trainingplan);

    Integer updateStatue(String id);

    PageInfo getList(String keyword, Integer pageSize, Integer pageNumber);

    List<TEntityTrainingplan> getListSimple();

    PageInfo getListWithCourses(String keyword, Integer pageSize, Integer pageNumber);

    boolean updateCourses(String id, String[] courses);

    boolean updateSemesters(TEntityTrainingplan trainingplan);

    PageInfo getListWithSemester(String keyword, Integer pageSize, Integer pageNumber);
}
