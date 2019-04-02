package com.lm.dao;

import com.lm.model.TEntityMajor;
import com.lm.model.TEntityMajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEntityMajorMapper {
    int countByExample(TEntityMajorExample example);

    int deleteByExample(TEntityMajorExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityMajor record);

    int insertSelective(TEntityMajor record);

    List<TEntityMajor> selectByExample(TEntityMajorExample example);

    TEntityMajor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityMajor record, @Param("example") TEntityMajorExample example);

    int updateByExample(@Param("record") TEntityMajor record, @Param("example") TEntityMajorExample example);

    int updateByPrimaryKeySelective(TEntityMajor record);

    int updateByPrimaryKey(TEntityMajor record);

    List<TEntityMajor> selectWithOtherByExample(TEntityMajorExample example);
}