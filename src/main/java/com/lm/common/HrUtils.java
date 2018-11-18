package com.lm.common;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.lm.model.Hr;

/**

 */
public class HrUtils {
    public static UserDetails getCurrentHr() {
    	UserDetails hr = new Hr() ;
    	hr = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal() ;
        return hr;
    }
    public static String getCurrentHrUsername() {
    	return SecurityContextHolder.getContext().getAuthentication().getName() ;
    }
}
