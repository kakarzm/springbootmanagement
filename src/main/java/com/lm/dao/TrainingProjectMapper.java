package com.lm.dao;

import com.lm.model.plan.basic.Training;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface TrainingProjectMapper {
    int save(Training training);
    int savecontent(List contentList);
    List<Map<String, String>> getList(@Param(value = "title") String title) ;
    int del(String id);
    int delCatalog(String id);
    int delContent(String id);
    Training searchid(String id);
    List<String> searchContentId(String id);
    int update(Training training);
    int updateContent(List contentList);

}
