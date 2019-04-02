package com.lm.service;

import com.lm.dao.TEntitySemesterMapper;
import com.lm.model.TEntitySemester;
import com.lm.model.TEntitySemesterExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName SemesterServiceImpl
 * @Description TODO
 * @Author wn
 * @Date 2019/4/2 9:44
 * @Version 1.0
 **/
@Service
@Transactional
public class SemesterServiceImpl implements SemesterService {
    @Autowired
    private TEntitySemesterMapper semesterMapper;

    @Override
    public List<TEntitySemester> getByPlanId(String id) {
        TEntitySemesterExample example = new TEntitySemesterExample();
        example.setOrderByClause("semester asc");
        example.createCriteria().andPlanIdEqualTo(id);
        return semesterMapper.selectByExample(example);
    }
}
