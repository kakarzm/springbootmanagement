package com.lm.dao;

import com.lm.model.TRelCourceTrainingRequire;
import com.lm.model.TRelCourceTrainingRequireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRelCourceTrainingRequireMapper {
    int countByExample(TRelCourceTrainingRequireExample example);

    int deleteByExample(TRelCourceTrainingRequireExample example);

    int deleteByPrimaryKey(String id);

    int insert(TRelCourceTrainingRequire record);

    int insertSelective(TRelCourceTrainingRequire record);

    List<TRelCourceTrainingRequire> selectByExample(TRelCourceTrainingRequireExample example);

    TRelCourceTrainingRequire selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TRelCourceTrainingRequire record, @Param("example") TRelCourceTrainingRequireExample example);

    int updateByExample(@Param("record") TRelCourceTrainingRequire record, @Param("example") TRelCourceTrainingRequireExample example);

    int updateByPrimaryKeySelective(TRelCourceTrainingRequire record);

    int updateByPrimaryKey(TRelCourceTrainingRequire record);
}