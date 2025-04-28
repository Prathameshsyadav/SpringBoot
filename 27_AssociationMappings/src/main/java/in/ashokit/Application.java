package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.manytomany.services.UserRoleService;
import in.ashokit.onetomany.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		UserRoleService bean = run.getBean(UserRoleService.class);
		
		System.out.println("m1() called");
		bean.m1();
		System.out.println("m1() over");
	}

}
