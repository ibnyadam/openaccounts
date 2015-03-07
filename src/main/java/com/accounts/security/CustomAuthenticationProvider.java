package com.accounts.security;


import java.util.ArrayList;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import com.accounts.service.interfaces.IUserService;
import com.accounts.utils.UtilityClass;
import com.accounts.valueobjects.UserVO;


@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{
	
	@Resource
	IUserService userService;
	
	public static Logger log = Logger.getLogger(CustomAuthenticationProvider.class);
    public Authentication authenticate(Authentication authentication) {
        if (authentication.getPrincipal() != null && authentication.getCredentials() != null) {
            
            UserVO user = new UserVO();
            user.setUsername(authentication.getPrincipal().toString());
            user.setPassword(UtilityClass.getMD5(authentication.getCredentials().toString()));
            log.info(user.getUsername());
            log.info(user.getPassword());
            user = userService.getUserByUsername(user.getUsername());
            
            // if(user!=null && user.getUserId() != null && !user.getUserType().equals(IConstants.User_Type_Blocked))

            if (user != null && user.getId() != null) {
                return new UsernamePasswordAuthenticationToken(
                        authentication.getName(),
                        authentication.getCredentials(), new ArrayList<GrantedAuthority>());
            }
        }
        return null;
    }

    public boolean supports(Class<? extends Object> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
