package com.lm.service.plan.basic;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.lm.dao.TbEntityCompanyNeedMapper;
import com.lm.model.plan.basic.TbEntityCompanyNeed;
import com.lm.model.plan.basic.TbEntityCompanyNeedExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CompanyService {

    @Autowired
    private TbEntityCompanyNeedMapper companyNeedMapper;
    // @Autowired
    //private TbEntityProfessionMapper professionMapper;

    public int add(TbEntityCompanyNeed company) {
        company.setCompanyNeedCreated(new Date());
        company.setCompanyNeedUpdated(new Date());
        company.setCompanyNeedStatus(1);
        return companyNeedMapper.insert(company);
    }

    public int update(TbEntityCompanyNeed company) {
        Integer companyNeedId = company.getCompanyNeedId();
        TbEntityCompanyNeed old = companyNeedMapper.selectByPrimaryKey(companyNeedId);
        company.setCompanyNeedCreated(old.getCompanyNeedCreated());
        company.setCompanyNeedStatus(old.getCompanyNeedStatus());
        company.setCompanyNeedUpdated(new Date());
        return companyNeedMapper.updateByPrimaryKey(company);
    }

    public boolean delete(String ids) {
        String[] split = ids.split(",");
        int i = 0;
        for (String str :
                split) {
            companyNeedMapper.deleteByPrimaryKey(Integer.parseInt(str));
            i++;
        }
        return i==split.length;
    }

    public List<TbEntityCompanyNeed> getCompanyByPage(Integer page, Integer size, String keywords) {
        PageHelper.startPage(page,size);
        TbEntityCompanyNeedExample example = new TbEntityCompanyNeedExample();
        TbEntityCompanyNeedExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keywords)) criteria = criteria.andCompanyNeedJobNameLike("%"+keywords+"%");
        example.setOrderByClause("company_need_id DESC");
        return companyNeedMapper.selectByExample(example);
    }

    public Long getCountByKeywords(String keywords) {
        TbEntityCompanyNeedExample example = new TbEntityCompanyNeedExample();
        TbEntityCompanyNeedExample.Criteria criteria = example.createCriteria().andCompanyNeedStatusEqualTo(1);
        if (!StringUtils.isEmpty(keywords)) criteria = criteria.andCompanyNeedJobNameLike("%"+keywords+"%");
        return (long)companyNeedMapper.countByExample(example);
    }

    public List<String> getProfessions() {
        //TbEntityProfessionExample example = new TbEntityProfessionExample();
        //example.createCriteria().andProfessionStatusEqualTo(1);
        //return professionMapper.selectByExample(example);
        return null ;
    }
}
