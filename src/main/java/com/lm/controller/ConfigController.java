package com.lm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lm.common.HrUtils;
import com.lm.model.Hr;
import com.lm.model.Menu;
import com.lm.service.HrServiceInterface;
import com.lm.service.MenuService;

/**
 * 这是一个只要登录就能访问的Controller
 * 主要用来获取一些配置信息
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    MenuService menuService;
    
    @Autowired
    HrServiceInterface hrService;
    
    
    @RequestMapping("/sysmenu")
    public List<Menu> sysmenu() {
    	System.out.println("获取菜单");
        return menuService.getMenusByHrId();
    }

    @RequestMapping("/hr")
    public Hr currentUser() {
        return hrService.getHrByUsername(HrUtils.getCurrentHrUsername());
    }
}
