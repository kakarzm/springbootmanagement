package com.lm.dao;

import com.lm.model.TEntityTrainingplan;
import com.lm.model.TEntityTrainingplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEntityTrainingplanMapper {
    int countByExample(TEntityTrainingplanExample example);

    int deleteByExample(TEntityTrainingplanExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityTrainingplan record);

    int insertSelective(TEntityTrainingplan record);

    List<TEntityTrainingplan> selectByExample(TEntityTrainingplanExample example);

    TEntityTrainingplan selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityTrainingplan record, @Param("example") TEntityTrainingplanExample example);

    int updateByExample(@Param("record") TEntityTrainingplan record, @Param("example") TEntityTrainingplanExample example);

    int updateByPrimaryKeySelective(TEntityTrainingplan record);

    int updateByPrimaryKey(TEntityTrainingplan record);

    List<TEntityTrainingplan> selectWithMajorByExample(TEntityTrainingplanExample example);

    List<TEntityTrainingplan> selectWithMajorAndCourseByExample(TEntityTrainingplanExample example);

    List<TEntityTrainingplan> selectWithMajorAndSemesterByExample(TEntityTrainingplanExample example);
}