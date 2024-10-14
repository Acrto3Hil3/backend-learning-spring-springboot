package com.utkarsh01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.utkarsh01.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByName(String name);
	List<Employee> findByNameStartingWith(String prefix);
	List<Employee> findByNameLike(String prefix);
	List<Employee> findByNameAndSalaryLessThan(String name,Double salary);
	List<Employee> findByNameOrSalary(String name, Double salary);
	List<Employee> findBySalaryBetween(Double starting, Double ending);
	
	
	@Query("select e1 from Employee e1 order by e1.address desc")
	List<Employee> showAllEmployeeOrderByAddress();
	
	@Query(value = "SELECT salary FROM employee WHERE salary=(SELECT MAX(salary)) FROM employee <(SELECT MAX(salary) FROM employee)",nativeQuery = true)
	Double secondMaxSalary();

}
