package com.lm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.dao.TEntityPlanMajorinfoMapper;
import com.lm.dao.TEntityTrainingplanMapper;
import com.lm.model.TEntityPlanMajorinfo;
import com.lm.model.TEntityPlanMajorinfoExample;
import com.lm.model.TEntityTrainingplan;
import com.lm.model.TEntityTrainingplanExample;
import com.lm.service.PlanMajorinfoService;
import com.lm.util.Guid;
import com.lm.util.SecurityUitil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * @ClassName PlanMajorinfoServiceImpl
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:34
 * @Version 1.0
 **/
@Service
@Transactional
public class PlanMajorinfoServiceImpl implements PlanMajorinfoService {
    @Autowired
    private TEntityPlanMajorinfoMapper planMajorinfoMapper;
    @Autowired
    private TEntityTrainingplanMapper trainingplanMapper;

    @Override
    public Integer addEntity(TEntityPlanMajorinfo planMajorinfo) {
        String currentUserId = SecurityUitil.getCurrentUserId();
        planMajorinfo.setCreateby(currentUserId);
        planMajorinfo.setEditby(currentUserId);
        planMajorinfo.setId(Guid.get());
        planMajorinfo.setCreatetime(new Date());
        planMajorinfo.setEdittime(new Date());
        planMajorinfo.setStatue("1");
        return planMajorinfoMapper.insert(planMajorinfo);
    }

    @Override
    public Integer updateEntity(TEntityPlanMajorinfo planMajorinfo) {
        TEntityPlanMajorinfo TEntityPlanMajorinfo = planMajorinfoMapper.selectByPrimaryKey(planMajorinfo.getId());
        planMajorinfo.setEditby(SecurityUitil.getCurrentUserId());
        planMajorinfo.setEdittime(new Date());
        planMajorinfo.setStatue(TEntityPlanMajorinfo.getStatue());
        planMajorinfo.setCreateby(TEntityPlanMajorinfo.getCreateby());
        planMajorinfo.setCreatetime(TEntityPlanMajorinfo.getCreatetime());
        return planMajorinfoMapper.updateByPrimaryKey(planMajorinfo);
    }

    @Override
    public Integer updateStatue(String id) {
        TEntityPlanMajorinfo entityPlanMajorinfo = planMajorinfoMapper.selectByPrimaryKey(id);
        entityPlanMajorinfo.setStatue("0");
        return planMajorinfoMapper.updateByPrimaryKey(entityPlanMajorinfo);
    }

    @Override
    public PageInfo getList(String keyword, Integer pageSize, Integer pageNumber) {
        TEntityPlanMajorinfoExample example = new TEntityPlanMajorinfoExample();
        TEntityPlanMajorinfoExample.Criteria criteria = example.createCriteria().andStatueEqualTo("1");
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andIntroductionLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageSize,pageNumber);
        return new PageInfo(planMajorinfoMapper.selectWithTrainingplanByExample(example));
    }

    @Override
    public List loadTrainingplan() {
        List<String> list = planMajorinfoMapper.selectDistinctPlanId();
        TEntityTrainingplanExample example = new TEntityTrainingplanExample();
        TEntityTrainingplanExample.Criteria criteria = example.createCriteria();
        if (!CollectionUtils.isEmpty(list)) {
            criteria.andIdNotIn(list);
        }
        criteria.andStatueEqualTo("1");
        return trainingplanMapper.selectByExample(example);
    }
}
