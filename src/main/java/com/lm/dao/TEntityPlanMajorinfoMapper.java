package com.lm.dao;

import com.lm.model.TEntityPlanMajorinfo;
import com.lm.model.TEntityPlanMajorinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEntityPlanMajorinfoMapper {
    int countByExample(TEntityPlanMajorinfoExample example);

    int deleteByExample(TEntityPlanMajorinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityPlanMajorinfo record);

    int insertSelective(TEntityPlanMajorinfo record);

    List<TEntityPlanMajorinfo> selectByExample(TEntityPlanMajorinfoExample example);

    TEntityPlanMajorinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityPlanMajorinfo record, @Param("example") TEntityPlanMajorinfoExample example);

    int updateByExample(@Param("record") TEntityPlanMajorinfo record, @Param("example") TEntityPlanMajorinfoExample example);

    int updateByPrimaryKeySelective(TEntityPlanMajorinfo record);

    int updateByPrimaryKey(TEntityPlanMajorinfo record);

    List<TEntityPlanMajorinfo> selectWithTrainingplanByExample(TEntityPlanMajorinfoExample example);

    List<String> selectDistinctPlanId();
}