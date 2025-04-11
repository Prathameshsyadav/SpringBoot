package in.ashokit.services;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.entity.Employee;

@Service
public class DemoServices {
	
	private final String url = "http://localhost:8080/getAllEmp";
	
	public void m1() {
		//run project 20_RestApiCRUD
		RestTemplate rt = new RestTemplate();
		 ResponseEntity<Employee[]> forEntity = rt.getForEntity(url, Employee[].class);
		Employee[] body = forEntity.getBody();
		for(Employee b: body) {
			System.out.println(b);
		}
		
	}

}
