package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.data.Employee;

@Service
public class RestConsumerService {
	
	private static final String getAllEmp = "http://localhost:8080/getAllEmp";
	
	private static final String getSingleEmp = "http://localhost:8080/getEmp?id=";
	
	private static final String addEmp = "http://localhost:8080/saveEmp";
	
	private static final String updateEmp = "http://localhost:8080/updateEmp";
	
	private static final String deleteEmp = "http://localhost:8080/deleteEmp?id=";
	
	public Employee[] callGetAllEmployee() {
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Employee[]> forEntity = rt.getForEntity(getAllEmp, Employee[].class);
		Employee[] employees = forEntity.getBody();
		
		return employees;
		
	}
	
	public Employee callGetSingleEmployee(Integer id) {
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Employee> forEntity = rt.getForEntity(getSingleEmp+id, Employee.class);
		return forEntity.getBody();
	}
	
	public String callAddEmployee(Employee employee) {
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> postForEntity = rt.postForEntity(addEmp,employee,String.class);
		
		return postForEntity.getBody();	
		
	}
	
	public String callUpdateEmployee(Employee emp) {
		
		RestTemplate rt = new RestTemplate();

	    return "Employee updated successfully";
	}
	
	
	public String callDeleteForEmployee(Integer id) {
		
		RestTemplate rt = new RestTemplate();
		
		 rt.delete(deleteEmp + id);

		    return "Employee deleted successfully";
	}
	
	

}
