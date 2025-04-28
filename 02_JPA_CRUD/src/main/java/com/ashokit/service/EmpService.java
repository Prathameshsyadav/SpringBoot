package com.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.entity.Employee;
import com.ashokit.repo.EmpRepo;

@Service
public class EmpService {
	
	private EmpRepo empRepo;
	
	public EmpService(EmpRepo empRepo) {
		// TODO Auto-generated constructor stub
		this.empRepo = empRepo;
	}
	
	public void saveEmployee() {
		Employee emp = new Employee();
		emp.seteId(4);
		emp.seteName("Prathamesh");
		emp.seteAddress("Ambernath");
		emp.seteSalary(18000.00);
		
		empRepo.save(emp);
		System.out.println("Employee Saved");
	}
	
	public void getEmployees() {
		Iterable<Employee> all = empRepo.findAll();
		all.forEach(System.out::println);
	}
	
	
	public void getEmployeesBySalary() {
		List<Employee> emp = empRepo.findByESalary(7000.00);
		emp.forEach(e -> System.out.println(e));
	}
	
	
	public void getEmpSalaryGreaterThan() {
		List<Employee> byESalaryGreaterThan = empRepo.findByESalaryGreaterThan(5000.00);
		
		byESalaryGreaterThan.forEach(System.out::println);
	}
	
	public void getEmpByNameAndAddress() {
		
		Employee byENameAndEAddress = empRepo.findByENameAndEAddress("Prathamesh", "Ambernath");
		System.out.println(byENameAndEAddress);
	}
	
	public void getEmpBySalaryEquals() {
		List<Employee> byESalaryEquals = empRepo.findByESalaryEquals(5000.00);
		byESalaryEquals.forEach(System.out::println);
	}
	
	

}
