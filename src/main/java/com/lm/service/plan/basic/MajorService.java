package com.lm.service.plan.basic;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.dao.BasicMajorMapper;
import com.lm.model.plan.basic.MajorBasic;
import com.lm.util.Guid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by iii on 2019/2/18.
 */
@Service
@Transactional
public class MajorService {
    @Autowired
    BasicMajorMapper majorMapper;

    public int save(MajorBasic majorBasic) {
        majorBasic.setId(Guid.get());
        return majorMapper.save(majorBasic);
    }

    public PageInfo<Map<String, String>> getList(String title, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, String>> list = majorMapper.getList(title);
        PageInfo<Map<String, String>> pageInfo = new PageInfo<Map<String, String>>(list);
        return pageInfo;
    }

    public int del(String id) {return majorMapper.del(id);}

    public MajorBasic searchid(String id){return majorMapper.searchid(id);}

    public int update(MajorBasic majorBasic) {return majorMapper.update(majorBasic);}

}