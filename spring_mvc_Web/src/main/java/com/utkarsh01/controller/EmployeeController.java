package com.utkarsh01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.utkarsh01.dao.EmployeeDao;
import com.utkarsh01.model.EmployeeDetails;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao empDao;
	
	
	@RequestMapping("/showEmp")
	public ModelAndView show() {
		List<EmployeeDetails> emp=empDao.getAllEmployee();
		ModelAndView mv=new ModelAndView("showEmp","employee",emp);
		return mv;
	}
	
	@RequestMapping("/addEmp")
	public String addEmp() {
		System.out.println("working..");
		return "addEmp";
	}
}
