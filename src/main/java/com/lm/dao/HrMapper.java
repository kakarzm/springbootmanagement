package com.lm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lm.model.Hr;
import com.lm.model.Role;

/**

 */
public interface HrMapper {
	
    Hr loadUserByUsername(String username);

    List<Role> getRolesByHrId(Long id);

    int hrReg(@Param("username") String username, @Param("password") String password);

    List<Hr> getHrsByKeywords(@Param("keywords") String keywords);

    int updateHr(Hr hr);

    int deleteRoleByHrId(Long hrId);

    int addRolesForHr(@Param("hrId") Long hrId, @Param("rids") Long[] rids);

    Hr getHrById(Long hrId);
    
    Hr getHrByUsername(String username);

    int deleteHr(Long hrId);
}
