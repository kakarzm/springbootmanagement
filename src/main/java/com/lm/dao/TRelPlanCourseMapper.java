package com.lm.dao;

import com.lm.model.TRelPlanCourse;
import com.lm.model.TRelPlanCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRelPlanCourseMapper {
    int countByExample(TRelPlanCourseExample example);

    int deleteByExample(TRelPlanCourseExample example);

    int deleteByPrimaryKey(String id);

    int insert(TRelPlanCourse record);

    int insertSelective(TRelPlanCourse record);

    List<TRelPlanCourse> selectByExample(TRelPlanCourseExample example);

    TRelPlanCourse selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TRelPlanCourse record, @Param("example") TRelPlanCourseExample example);

    int updateByExample(@Param("record") TRelPlanCourse record, @Param("example") TRelPlanCourseExample example);

    int updateByPrimaryKeySelective(TRelPlanCourse record);

    int updateByPrimaryKey(TRelPlanCourse record);
}