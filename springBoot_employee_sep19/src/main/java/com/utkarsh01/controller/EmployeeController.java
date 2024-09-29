package com.utkarsh01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.utkarsh01.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	@RequestMapping("/showDetails")
	public String showEmpDetails(Model model) {
		model.addAttribute("empKey", eService.showEmpDetails());
		return "show";
	}
	@RequestMapping("/deleteDetails")
	public String deleteEmpDetails(@RequestParam("id") Integer id) {
	    eService.deleteEmpDetails(id);
	    return "redirect:/showDetails";
	}
}
