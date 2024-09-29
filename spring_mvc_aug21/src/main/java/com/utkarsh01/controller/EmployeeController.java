package com.utkarsh01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utkarsh01.dao.EmployeeDao;
import com.utkarsh01.model.EmployeeDetails;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {
	@Autowired
	public EmployeeDao empDaoObj;

	@RequestMapping("/getAllEmployees")
	public String  getAllEmployees(Model model) {
		List<EmployeeDetails> empObj=empDaoObj.getAllEmployees();
		model.addAttribute("employee",empObj);
		return "showEmployees";
	}
	
	@RequestMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute EmployeeDetails empObject,Model model) {
		model.addAttribute("employee",empObject);
		return "success";
	}
	@RequestMapping("/updateEmployee")
	public String updateEmployee(HttpServletRequest req) {
		String eId=req.getParameter("empId");
		String eName=req.getParameter("name");
		String eDept=req.getParameter("dept");
		String eSal=req.getParameter("salary");
		EmployeeDetails empObj=new EmployeeDetails(Integer.parseInt(eId), eName, eDept, Double.parseDouble(eSal));
		empDaoObj.updateEmployee(empObj);
		return "redirect:/getAllEmployees";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee() {
		return "addEmployees";
	}
	
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(HttpServletRequest req) {
		String eId=req.getParameter("empId");
		empDaoObj.deleteEmployee(Integer.parseInt(eId));
		return "redirect:/getAll";
	}
	
	@RequestMapping("/editEmployee")
	public String editEmployee(HttpServletRequest req,Model model) {
		String id=req.getParameter("empId");
	EmployeeDetails empObj=empDaoObj.getEmployee(Integer.valueOf(id));
	model.addAttribute("employee",empObj);
		return "updateEmployees";
	}

}
