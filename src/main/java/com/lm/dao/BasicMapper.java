package com.lm.dao;


import com.lm.model.Menu;
import com.lm.model.plan.basic.Basic;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**

 */
public interface BasicMapper {

    int save(Basic basic) ;

    List<Map<String, String>> getList(@Param(value="title") String title) ;

    int del(String id) ;

    int update(Basic basic) ;

    Basic getDetail(String id) ;

}
