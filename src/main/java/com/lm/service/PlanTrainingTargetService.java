package com.lm.service;

import com.github.pagehelper.PageInfo;
import com.lm.model.TEntityPlanTrainingtarget;

import java.util.List;

public interface PlanTrainingTargetService {
    Integer addEntity(TEntityPlanTrainingtarget planTrainingtarget);

    Integer updateEntity(TEntityPlanTrainingtarget planTrainingtarget);

    Integer updateStatue(String id);

    PageInfo getList(String keyword, Integer pageSize, Integer pageNumber);

    List loadTrainingplan();
}
