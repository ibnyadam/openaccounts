package com.accounts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/secure")
public class AuthenticationController {

    @SuppressWarnings("unused")
	@RequestMapping(value = "/login")
    private String login(ModelMap models){
        if(false) {
            return "redirect:../index";
        }
        return "auth/login";
    }
}
