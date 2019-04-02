package com.lm.service;

import com.lm.model.TDmDistrict;

import java.util.List;

public interface DistrictService {
    List<TDmDistrict> getListByPid(Integer pid);
}
