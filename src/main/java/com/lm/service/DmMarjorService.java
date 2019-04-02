package com.lm.service;

import com.lm.model.TDmMajor;
import com.lm.vo.SimpleMajor;

import java.util.List;

public interface DmMarjorService {
    List<SimpleMajor> loadData();

    TDmMajor get(Integer id);

    Integer[] getPath(Integer id);
}
