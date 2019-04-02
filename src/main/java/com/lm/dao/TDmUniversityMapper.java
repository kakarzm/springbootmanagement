package com.lm.dao;

import com.lm.model.TDmUniversity;
import com.lm.model.TDmUniversityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDmUniversityMapper {
    int countByExample(TDmUniversityExample example);

    int deleteByExample(TDmUniversityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDmUniversity record);

    int insertSelective(TDmUniversity record);

    List<TDmUniversity> selectByExample(TDmUniversityExample example);

    TDmUniversity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDmUniversity record, @Param("example") TDmUniversityExample example);

    int updateByExample(@Param("record") TDmUniversity record, @Param("example") TDmUniversityExample example);

    int updateByPrimaryKeySelective(TDmUniversity record);

    int updateByPrimaryKey(TDmUniversity record);
}