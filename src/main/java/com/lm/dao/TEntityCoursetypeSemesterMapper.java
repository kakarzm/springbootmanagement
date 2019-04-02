package com.lm.dao;

import com.lm.model.TEntityCoursetypeSemester;
import com.lm.model.TEntityCoursetypeSemesterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEntityCoursetypeSemesterMapper {
    int countByExample(TEntityCoursetypeSemesterExample example);

    int deleteByExample(TEntityCoursetypeSemesterExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityCoursetypeSemester record);

    int insertSelective(TEntityCoursetypeSemester record);

    List<TEntityCoursetypeSemester> selectByExample(TEntityCoursetypeSemesterExample example);

    TEntityCoursetypeSemester selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityCoursetypeSemester record, @Param("example") TEntityCoursetypeSemesterExample example);

    int updateByExample(@Param("record") TEntityCoursetypeSemester record, @Param("example") TEntityCoursetypeSemesterExample example);

    int updateByPrimaryKeySelective(TEntityCoursetypeSemester record);

    int updateByPrimaryKey(TEntityCoursetypeSemester record);
}