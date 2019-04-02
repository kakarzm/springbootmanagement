package com.lm.dao;

import com.lm.model.TEntityPlanTrainingtarget;
import com.lm.model.TEntityPlanTrainingtargetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEntityPlanTrainingtargetMapper {
    int countByExample(TEntityPlanTrainingtargetExample example);

    int deleteByExample(TEntityPlanTrainingtargetExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityPlanTrainingtarget record);

    int insertSelective(TEntityPlanTrainingtarget record);

    List<TEntityPlanTrainingtarget> selectByExample(TEntityPlanTrainingtargetExample example);

    TEntityPlanTrainingtarget selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityPlanTrainingtarget record, @Param("example") TEntityPlanTrainingtargetExample example);

    int updateByExample(@Param("record") TEntityPlanTrainingtarget record, @Param("example") TEntityPlanTrainingtargetExample example);

    int updateByPrimaryKeySelective(TEntityPlanTrainingtarget record);

    int updateByPrimaryKey(TEntityPlanTrainingtarget record);

    List<TEntityPlanTrainingtarget> selectWithTrainingplanByExample(TEntityPlanTrainingtargetExample example);

    List<String> selectDistinctPlanId();
}