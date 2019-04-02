package com.lm.controller;

import com.lm.model.TEntityCourseType;
import com.lm.service.CourseTypeService;
import com.lm.vo.SimpleCourseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CourseTypeController
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:20
 * @Version 1.0
 **/
@RestController
@RequestMapping("/coursetype")
public class CourseTypeController {
    @Autowired
    private CourseTypeService courseTypeService;

    @GetMapping("/load")
    public Map<String,Object> loadData() {
        List<SimpleCourseType> list = courseTypeService.loadData();
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return map;
    }

    @GetMapping("/{id}")
    public Map<String,Object> get(@PathVariable("id") String id) {
        TEntityCourseType courseType = courseTypeService.get(id);
        Map<String,Object> map = new HashMap<>();
        map.put("entity",courseType);
        return map;
    }

    @GetMapping("/path/{id}")
    public Map<String,Object> getPath(@PathVariable("id") String id) {
        String[] array = courseTypeService.getPath(id);
        Map<String,Object> map = new HashMap<>();
        map.put("array",array);
        return map;
    }
}
