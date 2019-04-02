package com.lm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.dao.TEntityMajorMapper;
import com.lm.model.TEntityMajor;
import com.lm.model.TEntityMajorExample;
import com.lm.model.TEntityMajorExample;
import com.lm.service.MajorService;
import com.lm.util.Guid;
import com.lm.util.SecurityUitil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @ClassName MajorServiceImpl
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:18
 * @Version 1.0
 **/
@Service
@Transactional
public class MajorServiceImpl implements MajorService {
    @Autowired
    private TEntityMajorMapper majorMapper;

    @Override
    public Integer addEntity(TEntityMajor major) {
        String currentUserId = SecurityUitil.getCurrentUserId();
        major.setCreateby(currentUserId);
        major.setEditby(currentUserId);
        major.setId(Guid.get());
        major.setCreatetime(new Date());
        major.setEdittime(new Date());
        major.setStatue("1");
        return majorMapper.insert(major);
    }

    @Override
    public Integer updateEntity(TEntityMajor major) {
        TEntityMajor TEntityMajor = majorMapper.selectByPrimaryKey(major.getId());
        major.setEditby(SecurityUitil.getCurrentUserId());
        major.setEdittime(new Date());
        major.setStatue(TEntityMajor.getStatue());
        major.setCreateby(TEntityMajor.getCreateby());
        major.setCreatetime(TEntityMajor.getCreatetime());
        return majorMapper.updateByPrimaryKey(major);
    }

    @Override
    public Integer updateStatue(String id) {
        TEntityMajor entityMajor = majorMapper.selectByPrimaryKey(id);
        entityMajor.setStatue("0");
        return majorMapper.updateByPrimaryKey(entityMajor);
    }

    @Override
    public PageInfo getList(String keyword, Integer pageSize, Integer pageNumber) {
        TEntityMajorExample example = new TEntityMajorExample();
        TEntityMajorExample.Criteria criteria = example.createCriteria().andStatueEqualTo("1");
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageSize,pageNumber);
        return new PageInfo(majorMapper.selectWithOtherByExample(example));
    }

    @Override
    public List<TEntityMajor> getListSimple() {
        TEntityMajorExample example = new TEntityMajorExample();
        example.createCriteria().andStatueEqualTo("1");
        return majorMapper.selectByExample(example);
    }
}
