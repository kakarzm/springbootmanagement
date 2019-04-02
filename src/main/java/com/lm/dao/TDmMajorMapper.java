package com.lm.dao;

import com.lm.model.TDmMajor;
import java.util.List;

import com.lm.model.TDmMajorExample;
import com.lm.vo.SimpleMajor;
import org.apache.ibatis.annotations.Param;

public interface TDmMajorMapper {
    int countByExample(TDmMajorExample example);

    int deleteByExample(TDmMajorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDmMajor record);

    int insertSelective(TDmMajor record);

    List<TDmMajor> selectByExample(TDmMajorExample example);

    TDmMajor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDmMajor record, @Param("example") TDmMajorExample example);

    int updateByExample(@Param("record") TDmMajor record, @Param("example") TDmMajorExample example);

    int updateByPrimaryKeySelective(TDmMajor record);

    int updateByPrimaryKey(TDmMajor record);

    List<SimpleMajor> selectByPid(String pid);
}