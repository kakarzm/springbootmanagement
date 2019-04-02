package com.lm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.dao.TEntityPlanTrainingtargetMapper;
import com.lm.dao.TEntityPlanTrainingtargetRequireMapper;
import com.lm.dao.TEntityTrainingplanMapper;
import com.lm.model.*;
import com.lm.service.PlanTrainingTargetService;
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
 * @ClassName PlanTrainingTargetServiceImpl
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:28
 * @Version 1.0
 **/
@Service
@Transactional
public class PlanTrainingTargetServiceImpl implements PlanTrainingTargetService {
    @Autowired
    private TEntityPlanTrainingtargetMapper planTrainingtargetMapper;
    @Autowired
    private TEntityTrainingplanMapper trainingplanMapper;
    @Autowired
    private TEntityPlanTrainingtargetRequireMapper planTrainingtargetRequireMapper;

    @Override
    public Integer addEntity(TEntityPlanTrainingtarget planTrainingtarget) {
        String pttId = Guid.get(); //目标id
        String currentUserId = SecurityUitil.getCurrentUserId();
        List<TEntityPlanTrainingtargetRequire> targetRequires = planTrainingtarget.getTargetRequires();
        for (TEntityPlanTrainingtargetRequire pttr : targetRequires) {
            pttr.setId(Guid.get());
            pttr.setTargetId(pttId);
            pttr.setCreateby(currentUserId);
            pttr.setEditby(currentUserId);
            pttr.setCreatetime(new Date());
            pttr.setEdittime(new Date());
            pttr.setStatue("1");
            planTrainingtargetRequireMapper.insert(pttr);
        }
        planTrainingtarget.setCreateby(currentUserId);
        planTrainingtarget.setEditby(currentUserId);
        planTrainingtarget.setId(pttId);
        planTrainingtarget.setCreatetime(new Date());
        planTrainingtarget.setEdittime(new Date());
        planTrainingtarget.setStatue("1");
        return planTrainingtargetMapper.insert(planTrainingtarget);
    }

    @Override
    public Integer updateEntity(TEntityPlanTrainingtarget planTrainingtarget) {
        TEntityPlanTrainingtarget tEntityPlanTrainingtarget = planTrainingtargetMapper.selectByPrimaryKey(planTrainingtarget.getId());
        String pttId = tEntityPlanTrainingtarget.getId();//目标id
        // 删除关联的要求
        TEntityPlanTrainingtargetRequireExample example = new TEntityPlanTrainingtargetRequireExample();
        example.createCriteria().andTargetIdEqualTo(pttId);
        planTrainingtargetRequireMapper.deleteByExample(example);
        //新增关联要求
        List<TEntityPlanTrainingtargetRequire> targetRequires = planTrainingtarget.getTargetRequires();
        for (TEntityPlanTrainingtargetRequire pttr : targetRequires) {
            pttr.setId(Guid.get());
            pttr.setTargetId(pttId);
            pttr.setCreateby(SecurityUitil.getCurrentUserId());
            pttr.setEditby(SecurityUitil.getCurrentUserId());
            pttr.setCreatetime(new Date());
            pttr.setEdittime(new Date());
            pttr.setStatue("1");
            planTrainingtargetRequireMapper.insert(pttr);
        }
        //更新目标表
        planTrainingtarget.setEditby(SecurityUitil.getCurrentUserId());
        planTrainingtarget.setEdittime(new Date());
        planTrainingtarget.setStatue(tEntityPlanTrainingtarget.getStatue());
        planTrainingtarget.setCreateby(tEntityPlanTrainingtarget.getCreateby());
        planTrainingtarget.setCreatetime(tEntityPlanTrainingtarget.getCreatetime());
        return planTrainingtargetMapper.updateByPrimaryKey(planTrainingtarget);
    }

    @Override
    public Integer updateStatue(String id) {
        TEntityPlanTrainingtarget entityPlanMajorinfo = planTrainingtargetMapper.selectByPrimaryKey(id);
        entityPlanMajorinfo.setStatue("0");
        return planTrainingtargetMapper.updateByPrimaryKey(entityPlanMajorinfo);
    }

    @Override
    public PageInfo getList(String keyword, Integer pageSize, Integer pageNumber) {
        TEntityPlanTrainingtargetExample example = new TEntityPlanTrainingtargetExample();
        TEntityPlanTrainingtargetExample.Criteria criteria = example.createCriteria().andStatueEqualTo("1");
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andTargetLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageSize,pageNumber);
        return new PageInfo(planTrainingtargetMapper.selectWithTrainingplanByExample(example));
    }

    @Override
    public List loadTrainingplan() {
        List<String> list = planTrainingtargetMapper.selectDistinctPlanId();
        TEntityTrainingplanExample example = new TEntityTrainingplanExample();
        TEntityTrainingplanExample.Criteria criteria = example.createCriteria();
        if (!CollectionUtils.isEmpty(list)) {
            criteria.andIdNotIn(list);
        }
        criteria.andStatueEqualTo("1");
        return trainingplanMapper.selectByExample(example);
    }
}
