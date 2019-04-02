package com.lm.service.impl;

import com.lm.dao.TDmMajorMapper;
import com.lm.model.TDmMajor;
import com.lm.model.TDmMajorExample;
import com.lm.service.DmMarjorService;
import com.lm.vo.SimpleMajor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @ClassName DmMarjorServiceImp
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:15
 * @Version 1.0
 **/
@Service
@Transactional
public class DmMarjorServiceImpl implements DmMarjorService {
    @Autowired
    private TDmMajorMapper dmMajorMapper;

    @Override
    public List<SimpleMajor> loadData() {
        return getByPid(null);
    }

    @Override
    public TDmMajor get(Integer id) {
        return dmMajorMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer[] getPath(Integer id) {
        Integer[] array = new Integer[3];
        TDmMajor m3 = dmMajorMapper.selectByPrimaryKey(id);
        array[2] = m3.getId();
        String m2code = m3.getParentid();

        TDmMajorExample example = new TDmMajorExample();
        example.createCriteria().andMajorcodeEqualTo(m2code);
        TDmMajor m2 = dmMajorMapper.selectByExample(example).get(0);
        array[1] = m2.getId();
        String m1code = m2.getParentid();

        TDmMajorExample example2 = new TDmMajorExample();
        example2.createCriteria().andMajorcodeEqualTo(m1code);
        TDmMajor m1 = dmMajorMapper.selectByExample(example2).get(0);
        array[0] = m1.getId();
        return array;
    }

    public List<SimpleMajor> getByPid(String pid) {
        List<SimpleMajor> list = dmMajorMapper.selectByPid(pid);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        for (SimpleMajor major : list) {
            major.setChildren(getByPid(major.getCode()));
        }
        return list;
    }
}
