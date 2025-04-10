package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Employee;

public interface EmpService {
	
	public Boolean addEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmpById(Integer id);
	
	public Employee updateEmployee(Employee emp);
	
	public void deleteEmployeeById(Integer id);
	
	

}
