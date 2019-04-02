package com.lm.controller;

import com.github.pagehelper.PageInfo;
import com.lm.model.RespBean;
import com.lm.model.TEntityPlanTrainingtarget;
import com.lm.service.PlanTrainingTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PlanTrainingTargetController
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:27
 * @Version 1.0
 **/
@RestController
@RequestMapping("/ptt")
public class PlanTrainingTargetController {
    @Autowired
    private PlanTrainingTargetService planTrainingTargetService;

    @PostMapping("/entity")
    public RespBean addEntity(@RequestBody TEntityPlanTrainingtarget planTrainingtarget) {
        Integer i = planTrainingTargetService.addEntity(planTrainingtarget);
        return i != 0 ? new RespBean("success","添加成功") : new RespBean("error","添加失败");
    }

    @PutMapping("/entity")
    public RespBean updateEntity(@RequestBody TEntityPlanTrainingtarget planTrainingtarget) {
        Integer i = planTrainingTargetService.updateEntity(planTrainingtarget);
        return i != 0 ? new RespBean("success","修改成功") : new RespBean("error","修改失败");
    }

    @PutMapping("/statue/{id}")
    public RespBean updateEntity(@PathVariable("id") String id) {
        Integer i = planTrainingTargetService.updateStatue(id);
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
        PageInfo pageInfo = planTrainingTargetService.getList(keyword,pageSize,pageNumber);
        Map<String,Object> map = new HashMap<>();
        map.put("list",pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @GetMapping("/load/tp")
    public Map<String,Object> loadTrainingplan () {
        Map<String,Object> map = new HashMap<>();
        map.put("list",planTrainingTargetService.loadTrainingplan());
        return map;
    }
}
