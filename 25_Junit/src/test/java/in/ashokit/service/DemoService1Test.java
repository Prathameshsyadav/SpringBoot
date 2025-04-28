package in.ashokit.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import in.ashokit.repo.DemoRepo;

@SpringBootTest
@ExtendWith(value = {MockitoExtension.class})
public class DemoService1Test {
	
	@MockBean
	private DemoRepo demoRepo;
	
	@InjectMocks
	private DemoService1 demoService1;
	
	@Test
	public void testM1() {
		
		when(demoRepo.findUserById(11)).thenReturn("Raju");
		
		String m1 = demoService1.m1(11);
		
		assertNotNull(m1);
		
		assertEquals("Raju", m1);
	}

}
