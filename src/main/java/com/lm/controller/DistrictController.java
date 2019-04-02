package com.lm.controller;

import com.lm.model.TDmDistrict;
import com.lm.service.DistrictService;
import com.lm.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @ClassName DistrictController
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 10:43
 * @Version 1.0
 **/

@RequestMapping("/district")
@RestController
public class DistrictController {
    @Autowired
    private DistrictService districtService;


    @GetMapping("/pid/{pid}")
    public Map<String,Object> getListByPid(@PathVariable("pid") Integer pid) {
        List<TDmDistrict> list = districtService.getListByPid(pid);
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return map;
    }
}
