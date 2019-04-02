package com.lm.dao;

import com.lm.model.TEntitySemester;
import com.lm.model.TEntitySemesterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEntitySemesterMapper {
    int countByExample(TEntitySemesterExample example);

    int deleteByExample(TEntitySemesterExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntitySemester record);

    int insertSelective(TEntitySemester record);

    List<TEntitySemester> selectByExample(TEntitySemesterExample example);

    TEntitySemester selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntitySemester record, @Param("example") TEntitySemesterExample example);

    int updateByExample(@Param("record") TEntitySemester record, @Param("example") TEntitySemesterExample example);

    int updateByPrimaryKeySelective(TEntitySemester record);

    int updateByPrimaryKey(TEntitySemester record);

    List<TEntitySemester> selectByTp(String planId);
}