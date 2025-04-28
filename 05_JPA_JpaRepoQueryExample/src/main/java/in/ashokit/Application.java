package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		EmpService bean = run.getBean(EmpService.class);
		
		//bean.getAllEmpPage(1);
		
		Employee emp = new Employee();
		emp.seteName("Prathamesh");
		//emp.seteAddress("Pune");
		
		bean.getEmpByExample(emp);
	}

}
