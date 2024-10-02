package com.utkarsh01.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/")
	public String hello() {
		return "index";
	}
	
	@RequestMapping("/showDate")
	public ModelAndView showDateDetails() {
		LocalDateTime d=LocalDateTime.now();
		ModelAndView mv=new ModelAndView("showDate","dateKey",d);
		return mv;
	}
}
