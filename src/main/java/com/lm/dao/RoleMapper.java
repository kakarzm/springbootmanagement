package com.lm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.lm.model.Role;

/**

 */
public interface RoleMapper {
    List<Role> roles();

    int addNewRole(@Param("role") String role, @Param("roleZh") String roleZh);

    int deleteRoleById(Long rid);
}
