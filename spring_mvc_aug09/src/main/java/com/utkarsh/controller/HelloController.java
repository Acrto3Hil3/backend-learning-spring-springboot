package com.utkarsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/sayHello")
	public ModelAndView sayHello() {
		ModelAndView mv=new ModelAndView("/WEB-INF/views/hello.jsp");
		return mv;
	}
}
