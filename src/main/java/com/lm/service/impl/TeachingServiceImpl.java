package com.lm.service.impl;

import com.lm.dao.TEntityTeachingMapper;
import com.lm.service.TeachingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName TeachingServiceImpl
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:38
 * @Version 1.0
 **/
@Service
@Transactional
public class TeachingServiceImpl implements TeachingService {
    @Autowired
    private TEntityTeachingMapper teachingMapper;
}
