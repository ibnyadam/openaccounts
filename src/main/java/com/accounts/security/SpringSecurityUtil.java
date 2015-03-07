package com.accounts.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.accounts.utils.ServiceConstants;

@Repository(value = ServiceConstants.SPRING_SECURITY_UTIL)
@Transactional(readOnly = true)
public class SpringSecurityUtil {
    public static final String ANONYMOUS_USER = "anonymousUser";
    public boolean isAuthenticated(){
        return SecurityContextHolder.getContext().getAuthentication() != null &&
                SecurityContextHolder.getContext().getAuthentication().isAuthenticated() &&
                !ANONYMOUS_USER.equals(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
    }

    public String getLoginUserName(){
        if(isAuthenticated()){
            return SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        }

        return null;
    }
}
