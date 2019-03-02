package com.lm.service.plan.basic;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.dao.BasicCollegeMapper;
import com.lm.model.plan.basic.CollegeB;
import com.lm.util.Guid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by iii on 2019/2/11.
 */
@Service
@Transactional
public class CollegeService {
    @Autowired
    BasicCollegeMapper collegemapper;

    public int save(CollegeB s) {
        s.setId(Guid.get());
        System.out.println("收到"+s.getCollegeType());
        return collegemapper.save(s);
    }

    public int del(String id) {
        return collegemapper.del(id);
    }

    public int update(CollegeB s) {return collegemapper.update(s);}

    public CollegeB searchid(String id){return collegemapper.searchid(id);}

    public PageInfo<Map<String, String>> getList(String title, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);                                       //好像是负责翻页的
        List<Map<String, String>> list = collegemapper.getList(title);
        PageInfo<Map<String, String>> pageInfo = new PageInfo<Map<String, String>>(list);
        return pageInfo;
    }
}
