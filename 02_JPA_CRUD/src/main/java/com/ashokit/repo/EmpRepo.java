package com.ashokit.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer> {
	
	public List<Employee> findByESalary(Double Salary);
	
	public List<Employee> findByESalaryGreaterThan(Double Salary);
	
	public Employee findByENameAndEAddress(String name, String address);
	

}
