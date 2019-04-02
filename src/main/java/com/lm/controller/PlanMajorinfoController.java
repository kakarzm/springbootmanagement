package com.lm.controller;

import com.github.pagehelper.PageInfo;
import com.lm.model.RespBean;
import com.lm.model.TEntityPlanMajorinfo;
import com.lm.service.PlanMajorinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PlanMajorinfoController
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:33
 * @Version 1.0
 **/
@RestController
@RequestMapping("/pmi")
public class PlanMajorinfoController {
    @Autowired
    private PlanMajorinfoService planMajorinfoService;

    @PostMapping("/entity")
    public RespBean addEntity(TEntityPlanMajorinfo planMajorinfo) {
        Integer i = planMajorinfoService.addEntity(planMajorinfo);
        return i != 0 ? new RespBean("success","添加成功") : new RespBean("error","添加失败");
    }

    @PutMapping("/entity")
    public RespBean updateEntity(TEntityPlanMajorinfo planMajorinfo) {
        Integer i = planMajorinfoService.updateEntity(planMajorinfo);
        return i != 0 ? new RespBean("success","修改成功") : new RespBean("error","修改失败");
    }

    @PutMapping("/statue/{id}")
    public RespBean updateEntity(@PathVariable("id") String id) {
        Integer i = planMajorinfoService.updateStatue(id);
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
        PageInfo pageInfo = planMajorinfoService.getList(keyword,pageSize,pageNumber);
        Map<String,Object> map = new HashMap<>();
        map.put("list",pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @GetMapping("/load/tp")
    public Map<String,Object> loadTrainingplan () {
        Map<String,Object> map = new HashMap<>();
        map.put("list",planMajorinfoService.loadTrainingplan());
        return map;
    }
}
