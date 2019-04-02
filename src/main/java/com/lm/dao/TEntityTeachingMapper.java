package com.lm.dao;

import com.lm.model.TEntityTeaching;
import com.lm.model.TEntityTeachingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEntityTeachingMapper {
    int countByExample(TEntityTeachingExample example);

    int deleteByExample(TEntityTeachingExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEntityTeaching record);

    int insertSelective(TEntityTeaching record);

    List<TEntityTeaching> selectByExample(TEntityTeachingExample example);

    TEntityTeaching selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEntityTeaching record, @Param("example") TEntityTeachingExample example);

    int updateByExample(@Param("record") TEntityTeaching record, @Param("example") TEntityTeachingExample example);

    int updateByPrimaryKeySelective(TEntityTeaching record);

    int updateByPrimaryKey(TEntityTeaching record);
}