package com.utkarsh01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.utkarsh01.dao.EmployeeDao;
import com.utkarsh01.model.EmployeeDetails;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao empDao;
	
	@RequestMapping("/showEmp")
	public String show(Model model) {
		List<EmployeeDetails> employees=	 (List<EmployeeDetails>) empDao.showAllEmpl();
		model.addAttribute("employee", employees);
		return "showDetails";
	}
	
	@RequestMapping("/addEmp")
	public String add(Model model) {
		EmployeeDetails empObj=new EmployeeDetails();
		model.addAttribute("empKey", empObj);
		return "addDetails";
	}
	@RequestMapping("/saveEmp")
	public String save(@ModelAttribute EmployeeDetails empSave) {
		empDao.addEmplDetails(empSave);
		return "redirect:/showEmp";
	}
	
	
}
