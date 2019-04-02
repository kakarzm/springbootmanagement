package com.lm.service;

import com.github.pagehelper.PageInfo;
import com.lm.model.TEntityUniversity;

import java.util.List;

public interface UniversityService {
    Integer addEntity(TEntityUniversity university);

    PageInfo getList(String keyword, Integer pageSize, Integer pageNumber);

    Integer updateEntity(TEntityUniversity university);

    Integer updateStatue(String id);

    List<TEntityUniversity> getListSimple();
}
