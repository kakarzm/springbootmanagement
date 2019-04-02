package com.lm.controller;

import com.lm.model.TDmMajor;
import com.lm.service.DmMarjorService;
import com.lm.vo.SimpleMajor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DmMarjorController
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:13
 * @Version 1.0
 **/
@RestController
@RequestMapping("/dmmajor")
public class DmMarjorController {
    @Autowired
    public DmMarjorService dmMarjorService;

    @GetMapping("/load")
    public Map<String,Object> loadData() {
        List<SimpleMajor> list = dmMarjorService.loadData();
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return map;
    }

    @GetMapping("/{id}")
    public Map<String,Object> get(@PathVariable("id") Integer id) {
        TDmMajor major = dmMarjorService.get(id);
        Map<String,Object> map = new HashMap<>();
        map.put("entity",major);
        return map;
    }

    @GetMapping("/path/{id}")
    public Map<String,Object> getPath(@PathVariable("id") Integer id) {
        Integer[] array = dmMarjorService.getPath(id);
        Map<String,Object> map = new HashMap<>();
        map.put("array",array);
        return map;
    }
}
