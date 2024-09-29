package com.utkarsh01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.utkarsh01.dao.EmployeeDao;
import com.utkarsh01.entity.EmployeeDetails;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao empDao;

	@RequestMapping("/showEmp")
	public String showEMp(Model model) {
		List<EmployeeDetails> employees =empDao.showAllEmpl();
		model.addAttribute("employee", employees);
		return "showDetails";
	}

	@RequestMapping("/addEmp")
	public String addEMp(Model model) {
		EmployeeDetails empObj = new EmployeeDetails();
		model.addAttribute(empObj);
		return "addDetails";
	}

	@RequestMapping("/saveEmp")
	public String saveEMp(@Validated  EmployeeDetails empSave, BindingResult result) {
		if (result.hasErrors()) {			
			return "addDetails";
		}
		empDao.addEmplDetails(empSave);
		return "redirect:/showEmp";
	}

	@RequestMapping("/updateEmp")
	public String updateEMp(@Validated  EmployeeDetails empObj ,BindingResult result) {
		if (result.hasErrors())
			return "updateDetails";
		empDao.updateEmpDetails(empObj);
		return "redirect:/showEmp";
	}

	@RequestMapping("/editEmp")
	public String editEMp(@RequestParam("empId") Integer eId, Model model) {
		EmployeeDetails emoObj = empDao.getOneEmp(eId);
		model.addAttribute(emoObj);
		return "updateDetails";
	}

	@RequestMapping("/deleteEmp")
	public String deleteEMp(@RequestParam("empId") Integer eId) {
		empDao.deleteEmpDetails(eId);
		return "redirect:/showEmp";
	}
}
