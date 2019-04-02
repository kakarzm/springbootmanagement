package com.lm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.dao.TEntitySemesterMapper;
import com.lm.dao.TEntityTrainingplanMapper;
import com.lm.dao.TRelPlanCourseMapper;
import com.lm.model.*;
import com.lm.service.TrainingPlanService;
import com.lm.util.Guid;
import com.lm.util.SecurityUitil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @ClassName TrainingPlanServiceImpl
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:25
 * @Version 1.0
 **/
@Service
@Transactional
public class TrainingPlanServiceImpl implements TrainingPlanService {
    @Autowired
    private TEntityTrainingplanMapper trainingplanMapper;
    @Autowired
    private TRelPlanCourseMapper planCourseMapper;
    @Autowired
    private TEntitySemesterMapper semesterMapper;

    @Override
    public Integer addEntity(TEntityTrainingplan trainingplan) {
        String currentUserId = SecurityUitil.getCurrentUserId();
        trainingplan.setCreateby(currentUserId);
        trainingplan.setEditby(currentUserId);
        trainingplan.setId(Guid.get());
        trainingplan.setCreatetime(new Date());
        trainingplan.setEdittime(new Date());
        trainingplan.setStatue("1");
        return trainingplanMapper.insert(trainingplan);
    }

    @Override
    public Integer updateEntity(TEntityTrainingplan trainingplan) {
        TEntityTrainingplan TEntityTrainingplan = trainingplanMapper.selectByPrimaryKey(trainingplan.getId());
        trainingplan.setEditby(SecurityUitil.getCurrentUserId());
        trainingplan.setEdittime(new Date());
        trainingplan.setStatue(TEntityTrainingplan.getStatue());
        trainingplan.setCreateby(TEntityTrainingplan.getCreateby());
        trainingplan.setCreatetime(TEntityTrainingplan.getCreatetime());
        return trainingplanMapper.updateByPrimaryKey(trainingplan);
    }

    @Override
    public Integer updateStatue(String id) {
        TEntityTrainingplan entityMajor = trainingplanMapper.selectByPrimaryKey(id);
        entityMajor.setStatue("0");
        return trainingplanMapper.updateByPrimaryKey(entityMajor);
    }

    @Override
    public PageInfo getList(String keyword, Integer pageSize, Integer pageNumber) {
        TEntityTrainingplanExample example = new TEntityTrainingplanExample();
        TEntityTrainingplanExample.Criteria criteria = example.createCriteria().andStatueEqualTo("1");
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageSize,pageNumber);
        return new PageInfo(trainingplanMapper.selectWithMajorByExample(example));
    }

    @Override
    public List<TEntityTrainingplan> getListSimple() {
        TEntityTrainingplanExample example = new TEntityTrainingplanExample();
        example.createCriteria().andStatueEqualTo("1");
        return trainingplanMapper.selectByExample(example);
    }

    @Override
    public PageInfo getListWithCourses(String keyword, Integer pageSize, Integer pageNumber) {
        TEntityTrainingplanExample example = new TEntityTrainingplanExample();
        TEntityTrainingplanExample.Criteria criteria = example.createCriteria().andStatueEqualTo("1");
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageSize,pageNumber);
        return new PageInfo(trainingplanMapper.selectWithMajorAndCourseByExample(example));
    }

    @Override
    public boolean updateCourses(String id, String[] courses) {
        //先删除之前关联的数据
        TRelPlanCourseExample example = new TRelPlanCourseExample();
        example.createCriteria().andPlanIdEqualTo(id);
        int i = planCourseMapper.deleteByExample(example);
        //插入新的数据
        TRelPlanCourse planCourse = null;
        for (String course : courses) {
            planCourse = new TRelPlanCourse();
            planCourse.setId(Guid.get());
            planCourse.setPlanId(id);
            planCourse.setCourseId(course);
            planCourse.setCreateby(SecurityUitil.getCurrentUserId());
            planCourse.setEditby(SecurityUitil.getCurrentUserId());
            planCourse.setCreatetime(new Date());
            planCourse.setEdittime(new Date());
            planCourseMapper.insert(planCourse);
        }
        return true;
    }

    @Override
    public boolean updateSemesters(TEntityTrainingplan trainingplan) {
        String planId = trainingplan.getId();
        List<TEntitySemester> semesters = trainingplan.getSemesters();
        //先删除之前关联的学期
        TEntitySemesterExample example = new TEntitySemesterExample();
        example.createCriteria().andPlanIdEqualTo(planId);
        int i = semesterMapper.deleteByExample(example);
        //更新学期关联
        for (TEntitySemester semester : semesters) {
            semester.setId(Guid.get());
            semester.setPlanId(planId);
            semester.setCreateby(SecurityUitil.getCurrentUserId());
            semester.setEditby(SecurityUitil.getCurrentUserId());
            semester.setCreatetime(new Date());
            semester.setEdittime(new Date());
            semesterMapper.insert(semester);
        }
        return true;
    }

    @Override
    public PageInfo getListWithSemester(String keyword, Integer pageSize, Integer pageNumber) {
        TEntityTrainingplanExample example = new TEntityTrainingplanExample();
        TEntityTrainingplanExample.Criteria criteria = example.createCriteria().andStatueEqualTo("1");
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageSize,pageNumber);
        return new PageInfo(trainingplanMapper.selectWithMajorAndSemesterByExample(example));
    }
}
