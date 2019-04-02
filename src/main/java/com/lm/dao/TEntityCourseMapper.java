package com.lm.dao;

import com.lm.model.TEntityCourse;
import com.lm.model.TEntityCourseExample;
import java.util.List;

import com.lm.vo.SimpleCourse;
import org.apache.ibatis.annotations.Param;

public interface TEntityCourseMapper {
    int countByExample(TEntityCourseExample example);

    int deleteByExample(TEntityCourseExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityCourse record);

    int insertSelective(TEntityCourse record);

    List<TEntityCourse> selectByExample(TEntityCourseExample example);

    TEntityCourse selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityCourse record, @Param("example") TEntityCourseExample example);

    int updateByExample(@Param("record") TEntityCourse record, @Param("example") TEntityCourseExample example);

    int updateByPrimaryKeySelective(TEntityCourse record);

    int updateByPrimaryKey(TEntityCourse record);

    List<TEntityCourse> selectWithOtherByExample(TEntityCourseExample example);

    List<TEntityCourse> selectByTp(String tpid);

    List<SimpleCourse> initMain();
}