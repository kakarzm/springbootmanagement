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
@RequestMapping("/hi")
public class HiController {

    @Value("${server.port}")
    String port;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String hello() {
        System.out.println("say hi") ;
        return " hi ";
    }

    @RequestMapping("/neighbor")
    public String neighbor () {
        System.out.println("call neighbor") ;
        String t = "";
        try{
            t = restTemplate.getForObject("http://service-neo4j/hi/hi",String.class) ;
        }catch(Exception e){
            e.printStackTrace();
        }
        return t ;
    }

}
