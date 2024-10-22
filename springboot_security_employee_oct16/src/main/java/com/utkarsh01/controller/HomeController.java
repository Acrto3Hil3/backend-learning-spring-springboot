package com.utkarsh01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/say")
	public String say() {
		return "home for sprig security";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
}
