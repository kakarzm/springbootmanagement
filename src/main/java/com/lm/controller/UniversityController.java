package com.lm.controller;

import com.github.pagehelper.PageInfo;
import com.lm.model.RespBean;
import com.lm.model.TEntityUniversity;
import com.lm.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UniversityController
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 10:43
 * @Version 1.0
 **/


@RequestMapping("/university")
@RestController
public class UniversityController {
    @Autowired
    private UniversityService universityService;

    @PostMapping("/entity")
    public RespBean addEntity(TEntityUniversity university) {
        Integer i = universityService.addEntity(university);
        return i != 0 ? new RespBean("success","添加成功") : new RespBean("error","添加失败");
    }

    @PutMapping("/entity")
    public RespBean updateEntity(TEntityUniversity university) {
        Integer i = universityService.updateEntity(university);
        return i != 0 ? new RespBean("success","修改成功") : new RespBean("error","修改失败");
    }

    @PutMapping("/statue/{id}")
    public RespBean updateEntity(@PathVariable("id") String id) {
        Integer i = universityService.updateStatue(id);
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
        PageInfo pageInfo = universityService.getList(keyword,pageSize,pageNumber);
        Map<String,Object> map = new HashMap<>();
        map.put("list",pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }

    /**
     * 加载学校下拉列表(专业管理)
     * @return
     */
    @GetMapping("/list/s")
    public Map<String,Object> getListSimple () {
        List<TEntityUniversity> list = universityService.getListSimple();
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return map;
    }
}
