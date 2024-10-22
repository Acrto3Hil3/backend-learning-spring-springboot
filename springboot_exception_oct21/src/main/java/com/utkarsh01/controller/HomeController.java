package com.utkarsh01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.utkarsh01.service.UserService;

@Controller

public class HomeController {

	@Autowired
	private UserService service;
	
	@GetMapping("/msg")
	public String home() {
		return "hello";
	}

	@GetMapping("/")
	public String show(Model model) {
//		try {
//			display();
//
//		} catch (Exception ep) {
//			model.addAttribute("errorMsgKey", ep.getMessage());
//
//		}
		
		display();
		service.m1();
		return "error";
	}
	
//	private void display() {
//		
//	}
	

	private void display() {
//		throw new RuntimeException("This is runtime execption rises");
//		throw new NumberFormatException("This is Numberformat execption rises");
		throw new NullPointerException("This is NullPointer execption rises");
//		throw new Exception("This is Parent execption rises");
	}
	
}
