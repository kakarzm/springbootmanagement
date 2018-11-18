package com.lm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lm.dao.RoleMapper;
import com.lm.model.Role;

/**

 */
@Service
@Transactional
public class RoleService {
    @Autowired
    RoleMapper roleMapper;

    public List<Role> roles() {
        return roleMapper.roles();
    }

    public int addNewRole(String role, String roleZh) {
        if (!role.startsWith("ROLE_")) {
            role = "ROLE_" + role;
        }
        return roleMapper.addNewRole(role, roleZh);
    }

    public int deleteRoleById(Long rid) {
        return roleMapper.deleteRoleById(rid);
    }
}
