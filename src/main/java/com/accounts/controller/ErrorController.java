package com.accounts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
	
	@RequestMapping("/400")
	public String error400(){
		return "errors/404";
	}
	
	@RequestMapping("/404")
	public String error404(){
		return "errors/404";
	}
	
	@RequestMapping("/500")
	public String error500(){
		return "errors/404";
	}

}
