package com.lm.service;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.lm.model.Hr;
import com.lm.model.User;

public interface HrServiceInterface {

	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException  ;

    public int hrReg(String username, String password) ;

    public List<Hr> getHrsByKeywords(String keywords) ;

    public int updateHr(Hr hr) ;

    public int updateHrRoles(Long hrId, Long[] rids);

    public Hr getHrById(Long hrId) ;
    
    public Hr getHrByUsername(String username) ;
    
    public int deleteHr(Long hrId) ;

}