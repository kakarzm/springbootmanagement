package com.lm.dao;

import com.lm.model.plan.basic.TbEntityIndustryCertificate;
import com.lm.model.plan.basic.TbEntityIndustryCertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbEntityIndustryCertificateMapper {
    int countByExample(TbEntityIndustryCertificateExample example);

    int deleteByExample(TbEntityIndustryCertificateExample example);

    int deleteByPrimaryKey(Integer industryCertificateId);

    int insert(TbEntityIndustryCertificate record);

    int insertSelective(TbEntityIndustryCertificate record);

    List<TbEntityIndustryCertificate> selectByExample(TbEntityIndustryCertificateExample example);

    TbEntityIndustryCertificate selectByPrimaryKey(Integer industryCertificateId);

    int updateByExampleSelective(@Param("record") TbEntityIndustryCertificate record, @Param("example") TbEntityIndustryCertificateExample example);

    int updateByExample(@Param("record") TbEntityIndustryCertificate record, @Param("example") TbEntityIndustryCertificateExample example);

    int updateByPrimaryKeySelective(TbEntityIndustryCertificate record);

    int updateByPrimaryKey(TbEntityIndustryCertificate record);
}