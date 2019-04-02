package com.lm.dao;

import com.lm.model.TEntityUniversity;
import com.lm.model.TEntityUniversityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEntityUniversityMapper {
    int countByExample(TEntityUniversityExample example);

    int deleteByExample(TEntityUniversityExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityUniversity record);

    int insertSelective(TEntityUniversity record);

    List<TEntityUniversity> selectByExample(TEntityUniversityExample example);

    TEntityUniversity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityUniversity record, @Param("example") TEntityUniversityExample example);

    int updateByExample(@Param("record") TEntityUniversity record, @Param("example") TEntityUniversityExample example);

    int updateByPrimaryKeySelective(TEntityUniversity record);

    int updateByPrimaryKey(TEntityUniversity record);

    List<TEntityUniversity> selectWithDistricByExample(TEntityUniversityExample example);
}