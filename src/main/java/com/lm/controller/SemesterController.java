package com.lm.controller;

import com.lm.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SemesterController
 * @Description TODO
 * @Author wn
 * @Date 2019/4/2 9:42
 * @Version 1.0
 **/
@RequestMapping("/semester")
@RestController
public class SemesterController {
    @Autowired
    private SemesterService semesterService;

    @GetMapping("/plan/{id}")
    public Map<String,Object> getByPlanId(@PathVariable("id") String id) {
        Map<String,Object> map = new HashMap<>();
        map.put("list",semesterService.getByPlanId(id));
        return map;
    }

}
