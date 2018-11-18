package com.lm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lm.dao.SystemMapper;

/**

 */
@Service
@Transactional
public class SystemService {
    @Autowired
    SystemMapper systemMapper;

}
