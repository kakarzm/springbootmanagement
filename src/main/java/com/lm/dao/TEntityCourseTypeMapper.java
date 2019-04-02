package com.lm.dao;

import com.lm.model.TEntityCourseType;
import com.lm.model.TEntityCourseTypeExample;
import java.util.List;

import com.lm.vo.SimpleCourseType;
import org.apache.ibatis.annotations.Param;

public interface TEntityCourseTypeMapper {
    int countByExample(TEntityCourseTypeExample example);

    int deleteByExample(TEntityCourseTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityCourseType record);

    int insertSelective(TEntityCourseType record);

    List<TEntityCourseType> selectByExample(TEntityCourseTypeExample example);

    TEntityCourseType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityCourseType record, @Param("example") TEntityCourseTypeExample example);

    int updateByExample(@Param("record") TEntityCourseType record, @Param("example") TEntityCourseTypeExample example);

    int updateByPrimaryKeySelective(TEntityCourseType record);

    int updateByPrimaryKey(TEntityCourseType record);

    List<SimpleCourseType> selectByPid(String pid);
}