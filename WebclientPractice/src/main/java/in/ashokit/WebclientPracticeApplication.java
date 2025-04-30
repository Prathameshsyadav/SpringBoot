package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entities.Employee;
import in.ashokit.service.EmployeeWebclientService;
import in.ashokit.service.QuoteService;

@SpringBootApplication
public class WebclientPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WebclientPracticeApplication.class, args);
		
		EmployeeWebclientService bean = context.getBean(EmployeeWebclientService.class);
		
		//bean.syncResponseWebClient();
		
		//bean.asyncResponseWebClient();
		
		bean.getAllEmp();
//		
//		Employee emp = new Employee();
//		
//		emp.setId(31);
//		emp.setName("Prathamesh Yadav");
//		emp.setSalary(100000.00);
		
		//bean.addEmp(emp);
		
		//bean.deleteEmp(31);
	}

}
