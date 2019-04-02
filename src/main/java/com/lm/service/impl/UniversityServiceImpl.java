package com.lm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.dao.TEntityUniversityMapper;
import com.lm.model.TEntityUniversity;
import com.lm.model.TEntityUniversityExample;
import com.lm.service.UniversityService;
import com.lm.util.Guid;
import com.lm.util.SecurityUitil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UniversityServiceImpl implements UniversityService {
    @Autowired
    private TEntityUniversityMapper universityMapper;

    @Override
    public Integer addEntity(TEntityUniversity university) {
        String currentUserId = SecurityUitil.getCurrentUserId();
        university.setCreateby(currentUserId);
        university.setEditby(currentUserId);
        university.setId(Guid.get());
        university.setCreatetime(new Date());
        university.setEdittime(new Date());
        university.setStatue("1");
        return universityMapper.insert(university);
    }

    @Override
    public PageInfo getList(String keyword, Integer pageSize, Integer pageNumber) {
        TEntityUniversityExample example = new TEntityUniversityExample();
        TEntityUniversityExample.Criteria criteria = example.createCriteria().andStatueEqualTo("1");
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageSize,pageNumber);
        return new PageInfo(universityMapper.selectWithDistricByExample(example));
    }

    @Override
    public Integer updateEntity(TEntityUniversity university) {
        TEntityUniversity tEntityUniversity = universityMapper.selectByPrimaryKey(university.getId());
        university.setEditby(SecurityUitil.getCurrentUserId());
        university.setEdittime(new Date());
        university.setStatue(tEntityUniversity.getStatue());
        university.setCreateby(tEntityUniversity.getCreateby());
        university.setCreatetime(tEntityUniversity.getCreatetime());
        return universityMapper.updateByPrimaryKey(university);
    }

    @Override
    public Integer updateStatue(String id) {
        TEntityUniversity tEntityUniversity = universityMapper.selectByPrimaryKey(id);
        tEntityUniversity.setStatue("0");
        return universityMapper.updateByPrimaryKey(tEntityUniversity);
    }

    @Override
    public List<TEntityUniversity> getListSimple() {
        TEntityUniversityExample example = new TEntityUniversityExample();
        example.createCriteria().andStatueEqualTo("1");
        return universityMapper.selectByExample(example);
    }
}
