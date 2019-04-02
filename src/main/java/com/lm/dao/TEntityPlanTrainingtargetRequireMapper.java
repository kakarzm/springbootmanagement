package com.lm.dao;

import com.lm.model.TEntityPlanTrainingtargetRequire;
import com.lm.model.TEntityPlanTrainingtargetRequireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEntityPlanTrainingtargetRequireMapper {
    int countByExample(TEntityPlanTrainingtargetRequireExample example);

    int deleteByExample(TEntityPlanTrainingtargetRequireExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityPlanTrainingtargetRequire record);

    int insertSelective(TEntityPlanTrainingtargetRequire record);

    List<TEntityPlanTrainingtargetRequire> selectByExample(TEntityPlanTrainingtargetRequireExample example);

    TEntityPlanTrainingtargetRequire selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityPlanTrainingtargetRequire record, @Param("example") TEntityPlanTrainingtargetRequireExample example);

    int updateByExample(@Param("record") TEntityPlanTrainingtargetRequire record, @Param("example") TEntityPlanTrainingtargetRequireExample example);

    int updateByPrimaryKeySelective(TEntityPlanTrainingtargetRequire record);

    int updateByPrimaryKey(TEntityPlanTrainingtargetRequire record);

    List<TEntityPlanTrainingtargetRequire> selectByTargetId(String targetId);
}