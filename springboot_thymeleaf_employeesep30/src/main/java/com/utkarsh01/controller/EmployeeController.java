package com.utkarsh01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.utkarsh01.entity.Employee;
import com.utkarsh01.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping(value = {"/", "/home"})
	public String home(Model model) {
		model.addAttribute("empKey", service.showAll());
		return "home";
	}
	
	@GetMapping("/addEmp")
	public String addEmployee(Model model) {
		model.addAttribute(new Employee());
		return "addPage";
	}
	
	@PostMapping("/saveEmp")
	public String saveEmployee(@ModelAttribute Employee emp) {
		service.insertEmp(emp);
		return "redirect:/home";
	}
	
	@GetMapping("/deleteEmp/{id}")
	public String deleteEmployee(@PathVariable("id") Integer id) {
		service.deleteEmp(id);
		return "redirect:/home";
	}
}
