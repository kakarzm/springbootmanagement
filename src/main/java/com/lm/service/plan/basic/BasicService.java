package com.lm.service.plan.basic;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.dao.BasicMapper;
import com.lm.model.plan.basic.Basic;
import com.lm.util.Guid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**

 */
@Service
@Transactional
public class BasicService {

    @Autowired
    BasicMapper basicMapper;

    public int save(Basic s) {
        s.setId(Guid.get());
        return basicMapper.save(s);
    }

    public PageInfo<Map<String, String>> getList(String title, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, String>> list = basicMapper.getList(title);
        PageInfo<Map<String, String>> pageInfo = new PageInfo<Map<String, String>>(list);

        return pageInfo;
    }

    public int del(String id) {
        return basicMapper.del(id);
    }

    public int update(Basic s) {
        return basicMapper.update(s);
    }

    public Basic getDetail(String id) {

        return basicMapper.getDetail(id);
    }
}
