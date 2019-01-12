package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;



@EnableAutoConfiguration
@SpringBootApplication
@EnableRedisHttpSession
@ComponentScan(basePackages={"com"})//指定spring管理的bean所在的包
@MapperScan("com.lm.dao")//指定mybatis的mapper接口所在的包

public class Application{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}