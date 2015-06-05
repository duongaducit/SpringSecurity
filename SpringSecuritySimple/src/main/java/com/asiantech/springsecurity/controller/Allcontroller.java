package com.asiantech.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Allcontroller {

	@RequestMapping("/index")
	public String getIndex(){
		
		return "index";
	}
	
	@RequestMapping("sources/sources1**")
	public String getSources1()
	{
		return "sources1";
	}
	
	@RequestMapping("sources/sources2**")
	public String getSources2()
	{
		return "sources2";
	}
	
	@RequestMapping("errors")
	public String getErrors(){
		return "errors";
	}
	@RequestMapping(value = {"/","/login"})
	public ModelAndView login(@RequestParam(required=false) boolean error){  
        ModelAndView mav = new ModelAndView("login");  
        if(error) mav.addObject("error", error);  
        return mav;  
   }
}
