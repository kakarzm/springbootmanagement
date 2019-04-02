package com.lm.service.impl;

import com.lm.dao.TEntityPlanTrainingtargetRequireMapper;
import com.lm.service.PlanTrainingTargetRequireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName PlanTrainingTargetRequireServiceImpl
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 17:56
 * @Version 1.0
 **/
@Service
@Transactional
public class PlanTrainingTargetRequireServiceImpl implements PlanTrainingTargetRequireService {
    @Autowired
    private TEntityPlanTrainingtargetRequireMapper planTrainingtargetRequireMapper;
}
