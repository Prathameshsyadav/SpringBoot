package in.ashokit.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoServiceTest {

	@Autowired
	DemoService service;
	
	@Test
	public void testGetWelcomeMsg() {
		String welcomeMsg = service.getWelcomeMsg();
		assertNotNull(welcomeMsg);
	}
	
	@Test
	public void testGreetMsg() {
		String greetMsg = service.getGreetMsg();
		assertNotNull(greetMsg);
	}
}
