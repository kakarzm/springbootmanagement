package com.lm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kaka on 2018-11-17.
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;



    @RequestMapping("/hi")
    public String hello() {
        System.out.println("say hi") ;
        return " hi i am rfk from port " + port;
    }

    @RequestMapping("/neighbor")
    public String neighbor () {
        System.out.println("call neighbor") ;
        String t = "";

        return t ;
    }

}
