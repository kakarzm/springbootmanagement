package com.lm.dao;

import com.lm.model.TEntityTeachingSemester;
import com.lm.model.TEntityTeachingSemesterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEntityTeachingSemesterMapper {
    int countByExample(TEntityTeachingSemesterExample example);

    int deleteByExample(TEntityTeachingSemesterExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityTeachingSemester record);

    int insertSelective(TEntityTeachingSemester record);

    List<TEntityTeachingSemester> selectByExample(TEntityTeachingSemesterExample example);

    TEntityTeachingSemester selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityTeachingSemester record, @Param("example") TEntityTeachingSemesterExample example);

    int updateByExample(@Param("record") TEntityTeachingSemester record, @Param("example") TEntityTeachingSemesterExample example);

    int updateByPrimaryKeySelective(TEntityTeachingSemester record);

    int updateByPrimaryKey(TEntityTeachingSemester record);
}