package com.accounts.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.accounts.service.interfaces.IHeadService;
import com.accounts.valueobjects.HeadVO;

@Controller
public class IndexController {
	
	Logger log = Logger.getLogger(IndexController.class);

	@Resource
	IHeadService headService;
	
	@RequestMapping(value={"/","/index"})
	public String index(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		HeadVO headVO = new HeadVO();
		headVO.setName("Shah");
		headVO.setDescription("");
		headVO.setParentId(0);
		headVO.setStatus(1);
		headVO.setCreatedby(1);
		//headVO.setDatecreated();
		//headService.save(headVO);
		log.info("Index Executed");
		return "index";
	}

}