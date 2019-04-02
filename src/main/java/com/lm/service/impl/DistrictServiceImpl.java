package com.lm.service.impl;

import com.lm.dao.TDmDistrictMapper;
import com.lm.model.TDmDistrict;
import com.lm.model.TDmDistrictExample;
import com.lm.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private TDmDistrictMapper districtMapper;


    @Override
    public List<TDmDistrict> getListByPid(Integer pid) {
        TDmDistrictExample example = new TDmDistrictExample();
        example.createCriteria().andParentidEqualTo(pid);
        return districtMapper.selectByExample(example);
    }
}
