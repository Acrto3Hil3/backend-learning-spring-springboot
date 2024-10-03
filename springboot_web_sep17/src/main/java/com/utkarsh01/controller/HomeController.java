package com.utkarsh01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
//	@RequestMapping("/")
//	public String home(Model model) {
//		model.addAttribute("todayKey", new Date());
//		System.out.println("main component");
//		return "index";
//	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/showValue")
	public String hello() {
		return "salary";
	}
	
}
