package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.EmpDao;
import in.ashokit.entity.Employee;

@Service
public class EmpServices {
	
	@Autowired
	EmpDao empDao;
	
	public Employee findEmp() {
		 Employee employee = empDao.getEmployee();
		 
		 return employee;
	}
	
	public String addEmp(Employee e) {
		String save = empDao.save(e);
		return save;
	}
	

}
