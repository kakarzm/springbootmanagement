package com.lm.dao;

import com.lm.model.TDmDistrict;
import com.lm.model.TDmDistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDmDistrictMapper {

    int countByExample(TDmDistrictExample example);

    int deleteByExample(TDmDistrictExample example);

    int insert(TDmDistrict record);

    int insertSelective(TDmDistrict record);

    TDmDistrict selectByPrimaryKey(Integer id);

    List<TDmDistrict> selectByExample(TDmDistrictExample example);

    int updateByExampleSelective(@Param("record") TDmDistrict record, @Param("example") TDmDistrictExample example);

    int updateByExample(@Param("record") TDmDistrict record, @Param("example") TDmDistrictExample example);
}