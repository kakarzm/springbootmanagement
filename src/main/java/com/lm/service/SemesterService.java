package com.lm.service;

import com.lm.model.TEntitySemester;

import java.util.List;

/**
 * @ClassName SemesterService
 * @Description TODO
 * @Author wn
 * @Date 2019/4/2 9:43
 * @Version 1.0
 **/
public interface SemesterService {
    List<TEntitySemester> getByPlanId(String id);
}
