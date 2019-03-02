package com.lm.service.plan.basic;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.lm.dao.TbEntityIndustryCertificateMapper;
import com.lm.model.plan.basic.TbEntityIndustryCertificate;
import com.lm.model.plan.basic.TbEntityIndustryCertificateExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CertificateService {

    @Autowired
    private TbEntityIndustryCertificateMapper certificateMapper;

    /**
     * 行业证书添加
     * @param certificate
     * @return
     */
    public int add(TbEntityIndustryCertificate certificate) {
        certificate.setIndustryCertificateStatus(1);
        certificate.setIndustryCertificateCreated(new Date());
        certificate.setIndustryCertificateUpdated(new Date());
        return certificateMapper.insert(certificate);
    }


    /**
     * 行业证书修改
     * @param certificate
     * @return
     */
    public int update(TbEntityIndustryCertificate certificate) {
        TbEntityIndustryCertificate old = certificateMapper.selectByPrimaryKey(certificate.getIndustryCertificateId());
        certificate.setIndustryCertificateCreated(old.getIndustryCertificateCreated());
        certificate.setIndustryCertificateStatus(old.getIndustryCertificateStatus());
        certificate.setIndustryCertificateUpdated(new Date());
        return certificateMapper.updateByPrimaryKey(certificate);
    }

    public boolean delete(String ids) {
        String[] split = ids.split(",");
        int i = 0;
        for (String str :
                split) {
            i+=certificateMapper.deleteByPrimaryKey(Integer.parseInt(str));
        }
        return i==split.length;
    }

    public List<TbEntityIndustryCertificate> getCertificateByPage(Integer page,
                                                                  Integer size,
                                                                  String keywords,
                                                                  Integer industryCertificateDept,
                                                                  Integer industryCertificateProfession,
                                                                  Integer industryCertificateIdentificationSite,
                                                                  Integer industryCertificateOrganization,
                                                                  Integer industryCertificateAuthenticationType) {
        PageHelper.startPage(page,size);
        TbEntityIndustryCertificateExample example = new TbEntityIndustryCertificateExample();
        TbEntityIndustryCertificateExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keywords)) criteria = criteria.andIndustryCertificateNameLike("%"+keywords+"%");
        if (industryCertificateDept!=null) criteria = criteria.andIndustryCertificateDeptEqualTo(industryCertificateDept);
        if (industryCertificateProfession!=null) criteria = criteria.andIndustryCertificateProfessionEqualTo(industryCertificateProfession);
        if (industryCertificateIdentificationSite!=null) criteria = criteria.andIndustryCertificateIdentificationSiteEqualTo(industryCertificateIdentificationSite);
        if (industryCertificateOrganization!=null) criteria = criteria.andIndustryCertificateOrganizationEqualTo(industryCertificateOrganization);
        if (industryCertificateAuthenticationType!=null) criteria = criteria.andIndustryCertificateAuthenticationTypeEqualTo(industryCertificateAuthenticationType);
        return certificateMapper.selectByExample(example);
    }

    public Long getCountByKeywords(String keywords,
                                   Integer industryCertificateDept,
                                   Integer industryCertificateProfession,
                                   Integer industryCertificateIdentificationSite,
                                   Integer industryCertificateOrganization,
                                   Integer industryCertificateAuthenticationType) {
        TbEntityIndustryCertificateExample example = new TbEntityIndustryCertificateExample();
        TbEntityIndustryCertificateExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keywords)) criteria = criteria.andIndustryCertificateNameLike("%"+keywords+"%");
        if (industryCertificateDept!=null) criteria = criteria.andIndustryCertificateDeptEqualTo(industryCertificateDept);
        if (industryCertificateProfession!=null) criteria = criteria.andIndustryCertificateProfessionEqualTo(industryCertificateProfession);
        if (industryCertificateIdentificationSite!=null) criteria = criteria.andIndustryCertificateIdentificationSiteEqualTo(industryCertificateIdentificationSite);
        if (industryCertificateOrganization!=null) criteria = criteria.andIndustryCertificateOrganizationEqualTo(industryCertificateOrganization);
        if (industryCertificateAuthenticationType!=null) criteria = criteria.andIndustryCertificateAuthenticationTypeEqualTo(industryCertificateAuthenticationType);
        return (long)certificateMapper.countByExample(example);
    }
}
