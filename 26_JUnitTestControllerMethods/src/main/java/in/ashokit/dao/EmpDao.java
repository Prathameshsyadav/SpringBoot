package in.ashokit.dao;

import org.springframework.stereotype.Repository;

import in.ashokit.entity.Employee;

@Repository
public class EmpDao {
	
	public Employee getEmployee() {
		return new Employee(1, "Prathamesh", 10000.00);
	}

	public String save(Employee e) {
		
		return "EmpSaved";
		
	}
	

}
