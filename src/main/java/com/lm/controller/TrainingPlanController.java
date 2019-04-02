package com.lm.controller;

import com.github.pagehelper.PageInfo;
import com.lm.model.RespBean;
import com.lm.model.TEntityTrainingplan;
import com.lm.service.TrainingPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TrainingPlanController
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:24
 * @Version 1.0
 **/
@RestController
@RequestMapping("/trainingplan")
public class TrainingPlanController {
    @Autowired
    private TrainingPlanService trainingPlanService;

    @PostMapping("/entity")
    public RespBean addEntity(TEntityTrainingplan trainingplan) {
        Integer i = trainingPlanService.addEntity(trainingplan);
        return i != 0 ? new RespBean("success","添加成功") : new RespBean("error","添加失败");
    }

    @PutMapping("/entity")
    public RespBean updateEntity(TEntityTrainingplan trainingplan) {
        Integer i = trainingPlanService.updateEntity(trainingplan);
        return i != 0 ? new RespBean("success","修改成功") : new RespBean("error","修改失败");
    }

    @PutMapping("/statue/{id}")
    public RespBean updateEntity(@PathVariable("id") String id) {
        Integer i = trainingPlanService.updateStatue(id);
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
        PageInfo pageInfo = trainingPlanService.getList(keyword,pageSize,pageNumber);
        Map<String,Object> map = new HashMap<>();
        map.put("list",pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @GetMapping("/list/s")
    public Map<String,Object> getListSimple () {
        List<TEntityTrainingplan> list = trainingPlanService.getListSimple();
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return map;
    }

    @GetMapping("/course")
    public Map<String,Object> getListWithCourses (String keyword, Integer pageSize, Integer pageNumber) {
        PageInfo pageInfo = trainingPlanService.getListWithCourses(keyword,pageSize,pageNumber);
        Map<String,Object> map = new HashMap<>();
        map.put("list",pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @PostMapping("/course")
    public RespBean updateCourses (String id, String[] courses) {
        return trainingPlanService.updateCourses(id, courses) ? new RespBean("success","修改成功"): new RespBean("error","修改失败");
    }

    @GetMapping("/semester")
    public Map<String,Object> getListWithSemester (String keyword, Integer pageSize, Integer pageNumber) {
        PageInfo pageInfo = trainingPlanService.getListWithSemester(keyword,pageSize,pageNumber);
        Map<String,Object> map = new HashMap<>();
        map.put("list",pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @PostMapping("/semester")
    public RespBean updateSemesters (@RequestBody TEntityTrainingplan trainingplan) {
        return trainingPlanService.updateSemesters(trainingplan) ? new RespBean("success","修改成功"): new RespBean("error","修改失败");
    }
}
