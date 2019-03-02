package com.lm.service.plan.basic;

/**
 * Created by iii on 2019/2/18.
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.dao.BasicCourseMapper;
import com.lm.model.plan.basic.CourseB;
import com.lm.util.Guid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CourseService {
    @Autowired
    BasicCourseMapper courseMapper;
    public int save(CourseB courseb) {
        courseb.setId(Guid.get());
        System.out.println(courseb.getCourseCode());
        return courseMapper.save(courseb);
    }

    public PageInfo<Map<String, String>> getList(String title, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, String>> list = courseMapper.getList(title);
        PageInfo<Map<String, String>> pageInfo = new PageInfo<Map<String, String>>(list);
        return pageInfo;
    }

    public int del(String id) {return courseMapper.del(id);}

    public CourseB searchid(String id){return courseMapper.searchid(id);}

    public int update(CourseB courseB) {return courseMapper.update(courseB);}
}
