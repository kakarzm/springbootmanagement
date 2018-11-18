package com.lm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lm.common.HrUtils;
import com.lm.dao.HrMapper;
import com.lm.dao.MenuMapper;
import com.lm.model.Menu;

/**

 */
@Service
@Transactional
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Autowired
    HrMapper hrMapper;

    public List<Menu> getAllMenu(){
        return menuMapper.getAllMenu();
    }

    public List<Menu> getMenusByHrId(){
    	System.out.println("当前hrid: "+ hrMapper.getHrByUsername(HrUtils.getCurrentHrUsername()));
        return menuMapper.getMenusByHrId(hrMapper.getHrByUsername(HrUtils.getCurrentHrUsername()).getId());
    }

    public List<Menu> menuTree() {
        return menuMapper.menuTree();
    }

    public List<Long> getMenusByRid(Long rid) {
        return menuMapper.getMenusByRid(rid);
    }
}
