package com.lm.dao;


import java.util.List;

import com.lm.model.Menu;

/**

 */
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
