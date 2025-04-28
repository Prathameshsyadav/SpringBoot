package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entities.Quotes;
import in.ashokit.services.WebServices;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		WebServices bean = context.getBean(WebServices.class);
		
		//bean.quote1();
		
		bean.quote2();
	}

}
