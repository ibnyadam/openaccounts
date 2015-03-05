package com.accounts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/secure")
public class AuthenticationController {

    @SuppressWarnings("unused")
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    private String login(ModelMap models){
        if(false) {
            return "redirect:../index";
        }
        return "auth/login";
    }
    
    @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
    public String loginerror(ModelMap model) {
        model.addAttribute("error", "true");
        return "denied";
    }
 
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {
        return "logout";
    }
}
