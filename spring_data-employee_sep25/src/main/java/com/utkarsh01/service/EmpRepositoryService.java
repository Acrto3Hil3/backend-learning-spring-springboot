package com.utkarsh01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.utkarsh01.entity.Employee;
import com.utkarsh01.repository.EmployeeRepository;

@Component
public class EmpRepositoryService implements EmpServiceInterface {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> showAll() {
		return empRepo.findAll();
	}

	@Override
	public Employee showOne(Integer id) {
		return empRepo.findById(id).get();
	}

	@Override
	public void insertEmp(Employee emp) {
		empRepo.save(emp);
	}

	@Override
	public void updateEmp(Employee emp) {
	empRepo.save(emp);
	}

	@Override
	public void deleteEmp(Integer id) {
		empRepo.deleteById(id);
	}

	@Override
	public List<Employee> searchEmpByName(String name) {	
		return empRepo.findByNameStartingWith(name);
//		return empRepo.findByNameLike(name +"%");
//		return empRepo.findByNameOrSalary(name, 3500d);
		//return empRepo.showAllEmployeeOrderByAddress();
		
	}
	
}
