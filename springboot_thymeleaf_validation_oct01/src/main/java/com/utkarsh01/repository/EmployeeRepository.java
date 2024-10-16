package com.utkarsh01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh01.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
