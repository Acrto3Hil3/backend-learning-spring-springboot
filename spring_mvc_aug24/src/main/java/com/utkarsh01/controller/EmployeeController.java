package com.utkarsh01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.utkarsh01.dao.EmployeeDao;
import com.utkarsh01.model.EmployeeDetails;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao empDao;

	@RequestMapping("/showEmp")
	public String showEMp(Model model) {
		List<EmployeeDetails> employees = (List<EmployeeDetails>) empDao.showAllEmpl();
		model.addAttribute("employee", employees);
		return "showDetails";
	}

	@RequestMapping("/addEmp")
	public String addEMp(Model model) {
		EmployeeDetails empObj = new EmployeeDetails();
		model.addAttribute("empKey", empObj);
		return "addDetails";
	}

	@RequestMapping("/saveEmp")
	public String saveEMp(@ModelAttribute EmployeeDetails empSave) {
		empDao.addEmplDetails(empSave);
		return "redirect:/showEmp";
	}

	@RequestMapping("/updateEmp")
	public String updateEMp(@ModelAttribute EmployeeDetails empObj) {
		empDao.updateEmpDetails(empObj);
		return "redirect:/showEmp";
	}

	@RequestMapping("/editEmp")
	public String editEMp(@RequestParam("empId") Integer eId, Model model) {
		EmployeeDetails emoObj = empDao.oneEmplDetails(eId);
		model.addAttribute("empKey", emoObj);
		return "updateDetails";
	}

	@RequestMapping("/deleteEmp")
	public String deleteEMp(@RequestParam("empId") Integer eId) {
		empDao.deleteEmpDetails(eId);
		return "redirect:/showEmp";
	}
}
