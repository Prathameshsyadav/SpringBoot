package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.entities.Employee;

@Service
public class EmployeeWebclientService {
	
	public static final String getAllUrl = "http://localhost:8080/getAllEmp";
	
	public static final String saveEmpUrl = "http://localhost:8080/saveEmp";
	
	public static final String deleteUrl = "http://localhost:8080/deleteEmp?id=";
	
	WebClient webClient = WebClient.create();
	
	
	
	public void getAllEmp() {
		
		//WebClient webClient = WebClient.create();
		
		 List list = webClient.get().uri(getAllUrl).retrieve().bodyToMono(List.class).block();
		
		System.out.println(list);
		
	}
	
	public void addEmp(Employee emp) {
		
		String block = webClient.post().uri(saveEmpUrl).bodyValue(emp).retrieve().bodyToMono(String.class).block();
		
		System.out.println(block);
	}
	
	public void deleteEmp(Integer id) {
		webClient.delete().uri(deleteUrl+id).retrieve().bodyToMono(String.class).subscribe(System.out::println);
	}

}
