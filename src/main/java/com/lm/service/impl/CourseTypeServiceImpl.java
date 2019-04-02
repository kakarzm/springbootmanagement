package com.lm.service.impl;

import com.lm.dao.TEntityCourseTypeMapper;
import com.lm.model.TEntityCourseType;
import com.lm.model.TEntityCourseTypeExample;
import com.lm.service.CourseService;
import com.lm.service.CourseTypeService;
import com.lm.vo.SimpleCourseType;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName CourseTypeServiceImpl
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:21
 * @Version 1.0
 **/
@Service
@Transactional
public class CourseTypeServiceImpl implements CourseTypeService {
    @Autowired
    private TEntityCourseTypeMapper courseTypeMapper;

    @Override
    public List<SimpleCourseType> loadData() {
        return getByPid(null);
    }

    @Override
    public TEntityCourseType get(String id) {
        return courseTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public String[] getPath(String id) {
        String[] array = new String[2];
        TEntityCourseType ct2 = courseTypeMapper.selectByPrimaryKey(id);
        array[1] = ct2.getId();
        String pid = ct2.getPid();

        TEntityCourseType ct1 = courseTypeMapper.selectByPrimaryKey(pid);
        array[0] = ct1.getId();
        return array;
    }

    public List<SimpleCourseType> getByPid(String pid) {
        List<SimpleCourseType> list = courseTypeMapper.selectByPid(pid);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        for (SimpleCourseType courseType : list) {
            courseType.setChildren(getByPid(courseType.getValue()));
        }
        return list;
    }
}
