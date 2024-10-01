package com.utkarsh01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.utkarsh01.dao.ProjectDao;
import com.utkarsh01.entity.ProjectEntity;

@Controller
public class ProjectController {
	
	@Autowired
	private ProjectDao dao;
	
	@RequestMapping("/showProDetails")
	public String showAllProjects(Model model) {
		List<ProjectEntity> pro=dao.getAllProjects();
		model.addAttribute("proKey", pro);
		return "showDetails";
	}
	
	@RequestMapping("/addProDetails")
	public String addProject(Model model) {
		model.addAttribute(new ProjectEntity());
		return "addDetails";
	}
	
	@RequestMapping("/saveProDetails")
	public String saveProject(@Validated
			 ProjectEntity pro, BindingResult res) {
		if(res.hasErrors())
			return "addDetails";
		dao.insertProDetails(pro);
		return "redirect:/showProDetails";
	}
	
	@RequestMapping("/deleteProject")
	public String deleteProject(@RequestParam("projectId") Integer proId ) {
		dao.deleteProDetails(proId);
		return "redirect:/showProDetails";
	}
	
	@RequestMapping("/editProject")
	public String editProject(@RequestParam("projectId") Integer proId,Model model) {
		ProjectEntity pro=dao.getOneProDetail(proId);
		model.addAttribute(pro);
		return "updateDetails";
	}
	
	@RequestMapping("/updateProDetails")
	public String updateProject(@Validated ProjectEntity pro, BindingResult res) {
		if(res.hasErrors())
			return "updateDetails";
		dao.updateProDetails(pro);
		return "redirect:/showProDetails";
	}
	
}
