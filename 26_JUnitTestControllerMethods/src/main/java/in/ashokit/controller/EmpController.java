package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmpServices;

@RestController
public class EmpController {
	
	@Autowired
	EmpServices empServices;
	
	@GetMapping("/emp")
	public Employee getEmp() {
		return empServices.findEmp();
		
	}
	
	@PostMapping("/emp")
	public String addEmployee(@RequestBody Employee e) {
		 String emp = empServices.addEmp(e);
		 if(emp.equals("EmpSaved")) {
			 return "Employee saved";
		 }else {
			 return "Emp Not Saved";
		 }
	}

}
