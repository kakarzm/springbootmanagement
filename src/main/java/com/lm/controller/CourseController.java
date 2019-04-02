package com.lm.controller;

import com.github.pagehelper.PageInfo;
import com.lm.model.RespBean;
import com.lm.model.TEntityCourse;
import com.lm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CourseController
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:22
 * @Version 1.0
 **/
@RequestMapping("/course")
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/entity")
    public RespBean addEntity(TEntityCourse course) {
        Integer i = courseService.addEntity(course);
        return i != 0 ? new RespBean("success","添加成功") : new RespBean("error","添加失败");
    }

    @PutMapping("/entity")
    public RespBean updateEntity(TEntityCourse course) {
        Integer i = courseService.updateEntity(course);
        return i != 0 ? new RespBean("success","修改成功") : new RespBean("error","修改失败");
    }

    @PutMapping("/statue/{id}")
    public RespBean updateEntity(@PathVariable("id") String id) {
        Integer i = courseService.updateStatue(id);
        return i != 0 ? new RespBean("success","删除成功") : new RespBean("error","删除失败");
    }

    /**
     * 获取table + 分页 + 条件查询
     * @param keyword
     * @param pageSize
     * @param pageNumber
     * @return
     */
    @GetMapping("/list")
    public Map<String,Object> getList (String keyword, Integer pageSize, Integer pageNumber) {
        PageInfo pageInfo = courseService.getList(keyword,pageSize,pageNumber);
        Map<String,Object> map = new HashMap<>();
        map.put("list",pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @GetMapping("/initMain")
    public Map<String,Object> initMain () {
        Map<String,Object> map = new HashMap<>();
        map.put("list",courseService.initMain());
        return map;
    }
}
