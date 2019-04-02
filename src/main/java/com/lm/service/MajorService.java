package com.lm.service;

import com.github.pagehelper.PageInfo;
import com.lm.model.TEntityMajor;

import java.util.List;

public interface MajorService {
    Integer addEntity(TEntityMajor major);

    Integer updateEntity(TEntityMajor major);

    Integer updateStatue(String id);

    PageInfo getList(String keyword, Integer pageSize, Integer pageNumber);

    List<TEntityMajor> getListSimple();
}
