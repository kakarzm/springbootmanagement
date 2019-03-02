package com.lm.dao;

import com.lm.model.plan.basic.TbEntityCompanyNeed;
import com.lm.model.plan.basic.TbEntityCompanyNeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbEntityCompanyNeedMapper {
    int countByExample(TbEntityCompanyNeedExample example);

    int deleteByExample(TbEntityCompanyNeedExample example);

    int deleteByPrimaryKey(Integer companyNeedId);

    int insert(TbEntityCompanyNeed record);

    int insertSelective(TbEntityCompanyNeed record);

    List<TbEntityCompanyNeed> selectByExample(TbEntityCompanyNeedExample example);

    TbEntityCompanyNeed selectByPrimaryKey(Integer companyNeedId);

    int updateByExampleSelective(@Param("record") TbEntityCompanyNeed record, @Param("example") TbEntityCompanyNeedExample example);

    int updateByExample(@Param("record") TbEntityCompanyNeed record, @Param("example") TbEntityCompanyNeedExample example);

    int updateByPrimaryKeySelective(TbEntityCompanyNeed record);

    int updateByPrimaryKey(TbEntityCompanyNeed record);
}