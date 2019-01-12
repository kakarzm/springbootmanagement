package com.lm.controller.neo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kaka on 2018-11-18.
 */
@RestController
@RequestMapping("/neoexa")
public class NeoExample {

//    @Autowired
//    RestTemplate restTemplate;
//
//
//    @RequestMapping("/count")
//    public Map getCount () {
//        System.out.println("get count") ;
//        Map t = new HashMap();
//        try{
//            t = restTemplate.getForObject("http://service-neo4j/example/count",HashMap.class) ;
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return t ;
//    }
//
//    @RequestMapping("/nodes")
//    public Map getNodes () {
//        System.out.println("get getNodes") ;
//        List<Map> t = new ArrayList();
//        List<Map> r = new ArrayList();
//        Map m = new HashMap() ;
//        try{
//            t = restTemplate.getForObject("http://service-neo4j/example/nodes",ArrayList.class) ;
//
//            System.out.println("nodes size:----" + t.size()) ;
//            for(Map a : t){
//                m = new HashMap() ;
//                m.put("id",((Map)a.get("n")).get("id")) ;
//                m.put("version",((Map)a.get("n")).get("version")) ;
//                m.put("labels",((Map)((Map)a.get("n")).get("labels")).get("labels")) ;
//                m.put("pkey",((Map)((Map)((Map)a.get("n")).get("propertyList")).get("propertyList")).get("key")) ;
//                m.put("pvalue",((Map)((Map)((Map)a.get("n")).get("propertyList")).get("propertyList")).get("value")) ;
//                r.add(m) ;
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        Map result = new HashMap() ;
//        result.put("list", r) ;
//        return result ;
//    }
}
