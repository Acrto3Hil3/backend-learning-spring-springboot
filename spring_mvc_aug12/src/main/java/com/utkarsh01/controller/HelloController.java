package com.utkarsh01.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/showInstitute")
	public ModelAndView showInstitute() {
		String name="Utkarsh Classes";
		ModelAndView mv=new ModelAndView("hello","abc",name);
		return mv;
	}
	
	@RequestMapping("/showDate")
	public ModelAndView showDate() {
		Date date=new Date();
		String name="NareshIT";
		ModelAndView mv=new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("xyz", date);
		mv.addObject("abc", name);
		return mv;
	}
	
	
	@RequestMapping("/showStudent")
	public String showStudent(Model model) {
		model.addAttribute("st", new Date());
		return "student";
	}
}
