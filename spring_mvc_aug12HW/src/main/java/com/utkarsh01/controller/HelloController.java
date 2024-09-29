package com.utkarsh01.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController {
	
	@RequestMapping("/view")
	public String view() {
		return "view";
	}

	@RequestMapping("/About")
	public ModelAndView AboutPage() {
		ModelAndView mv=new ModelAndView("About","info","Gandi Nagar Mumbai 652363");
		return mv;
	}
	
	@RequestMapping("/Contact")
	public ModelAndView COntactPage() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", "Utkarsh Yaduvanshi");
		mv.addObject("location", "Ludhiana");
		mv.addObject("contact", 9876543212l);
		mv.setViewName("Contact");
		return mv;
	}
	@RequestMapping(path = "/form", method = RequestMethod.POST)
	public String signUp(@ModelAttribute Details details,@RequestParam("no") long n) {
		System.out.println("Successfully stored..");
		System.out.println(details);
		System.out.println("Phone no : "+n);
		return "Contact";
	}
	
	@RequestMapping("/Home")
	public String HomePage(Model model ) {
		model.addAttribute("name", "Ramu");
		model.addAttribute("date1", new Date());
		model.addAttribute("rollno",	123);
		return "Home";
	}
	
	@RequestMapping("/Service")
	public String ServicePage() {
		return "Service";
	}
	
}
