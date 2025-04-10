package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		EmployeeService bean = run.getBean(EmployeeService.class);
		
		Employee emp = new Employee();
		emp.setName("Ganesh");
		bean.saveEmp(emp);
		
		Employee emp1 = new Employee();
		emp1.setName("Prathamesh");
		bean.saveEmp(emp1);
		
	}

}
