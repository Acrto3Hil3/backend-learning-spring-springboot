package com.utkarsh01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utkarsh01.model.Employee;

@RestController
public class HOmeControl {

	@GetMapping("/sayhello")
	public String  home() {
		return "rest controller controller";
	}
	
	@GetMapping("/showdata")
	public Employee display() {
		return new Employee(1l, "ram", "delhi", 45032d);
	}
}
