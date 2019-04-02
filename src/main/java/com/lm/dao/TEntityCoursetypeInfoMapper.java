package com.lm.dao;

import com.lm.model.TEntityCoursetypeInfo;
import com.lm.model.TEntityCoursetypeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEntityCoursetypeInfoMapper {
    int countByExample(TEntityCoursetypeInfoExample example);

    int deleteByExample(TEntityCoursetypeInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityCoursetypeInfo record);

    int insertSelective(TEntityCoursetypeInfo record);

    List<TEntityCoursetypeInfo> selectByExample(TEntityCoursetypeInfoExample example);

    TEntityCoursetypeInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityCoursetypeInfo record, @Param("example") TEntityCoursetypeInfoExample example);

    int updateByExample(@Param("record") TEntityCoursetypeInfo record, @Param("example") TEntityCoursetypeInfoExample example);

    int updateByPrimaryKeySelective(TEntityCoursetypeInfo record);

    int updateByPrimaryKey(TEntityCoursetypeInfo record);
}