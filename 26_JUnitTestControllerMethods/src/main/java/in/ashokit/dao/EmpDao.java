package in.ashokit.dao;

import java.util.Arrays;
import java.util.List;

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
	
	private List<Employee> getAllEmployee() {
		return Arrays.asList(new Employee(1, "Labna", 2000.00), new Employee(2, "Shijuka", 3000.00));
	}
	

}
