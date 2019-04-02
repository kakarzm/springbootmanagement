package com.lm.service;

import com.github.pagehelper.PageInfo;
import com.lm.model.TEntityPlanMajorinfo;

import java.util.List;

public interface PlanMajorinfoService {
    Integer addEntity(TEntityPlanMajorinfo planMajorinfo);

    Integer updateEntity(TEntityPlanMajorinfo planMajorinfo);

    Integer updateStatue(String id);

    PageInfo getList(String keyword, Integer pageSize, Integer pageNumber);

    List loadTrainingplan();
}
