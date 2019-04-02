package com.lm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.dao.TEntityCourseMapper;
import com.lm.model.TEntityCourse;
import com.lm.model.TEntityCourseExample;
import com.lm.service.CourseService;
import com.lm.util.Guid;
import com.lm.util.SecurityUitil;
import com.lm.vo.SimpleCourse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @ClassName CourseServiceImpl
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:22
 * @Version 1.0
 **/
@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Autowired
    private TEntityCourseMapper courseMapper;

    @Override
    public Integer addEntity(TEntityCourse course) {
        String currentUserId = SecurityUitil.getCurrentUserId();
        course.setCreateby(currentUserId);
        course.setEditby(currentUserId);
        course.setId(Guid.get());
        course.setCreatetime(new Date());
        course.setEdittime(new Date());
        course.setStatue("1");
        return courseMapper.insert(course);
    }

    @Override
    public Integer updateEntity(TEntityCourse course) {
        TEntityCourse TEntityCourse = courseMapper.selectByPrimaryKey(course.getId());
        course.setEditby(SecurityUitil.getCurrentUserId());
        course.setEdittime(new Date());
        course.setStatue(TEntityCourse.getStatue());
        course.setCreateby(TEntityCourse.getCreateby());
        course.setCreatetime(TEntityCourse.getCreatetime());
        return courseMapper.updateByPrimaryKey(course);
    }

    @Override
    public Integer updateStatue(String id) {
        TEntityCourse entitycourse = courseMapper.selectByPrimaryKey(id);
        entitycourse.setStatue("0");
        return courseMapper.updateByPrimaryKey(entitycourse);
    }

    @Override
    public PageInfo getList(String keyword, Integer pageSize, Integer pageNumber) {
        TEntityCourseExample example = new TEntityCourseExample();
        TEntityCourseExample.Criteria criteria = example.createCriteria().andStatueEqualTo("1");
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageSize,pageNumber);
        return new PageInfo(courseMapper.selectWithOtherByExample(example));
    }

    @Override
    public List<SimpleCourse> initMain() {
        return courseMapper.initMain();
    }
}
