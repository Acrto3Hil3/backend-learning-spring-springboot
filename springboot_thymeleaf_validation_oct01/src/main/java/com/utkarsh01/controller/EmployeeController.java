package com.utkarsh01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.utkarsh01.entity.Employee;
import com.utkarsh01.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping(value  = {"/","/home"})
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
	public String saveEmployee(@Validated Employee emp,BindingResult result) {
		if(result.hasErrors())
			return "addPage";
		service.insertEmployee(emp);
		return "redirect:/home";
	}
	
	@GetMapping("/editEmp/ {eId}")
	public String editEmployee(@PathVariable("eId") Integer id,Model model) {
		model.addAttribute(service.showOne(id));
		return "editPage";
	}
	
	@PostMapping("/updateEmp")
	public String updateEmployee(@Validated Employee emp,BindingResult result) {
		if(result.hasErrors())
			return "editPage";
		service.updateEmployee(emp);
		return "redirect:/home";
	}
	
	@GetMapping("/deleteEmp/ {eId}")
	public String deleteEmployee(@PathVariable("eId") Integer id) {
		service.deleteEmployee(id);
		return "redirect:/home";
	}
}
