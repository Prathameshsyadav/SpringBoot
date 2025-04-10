package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmpRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmpRepo empRepo;
	
	public void saveEmp(Employee emp) {
		Employee save = empRepo.save(emp);
		System.out.println("Employee saved "+save);
	}

}
