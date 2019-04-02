package com.lm.controller;

import com.lm.service.TeachingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TeachingController
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:37
 * @Version 1.0
 **/
@RestController
@RequestMapping("/teahing")
public class TeachingController {
    @Autowired
    private TeachingService teachingService;
}
