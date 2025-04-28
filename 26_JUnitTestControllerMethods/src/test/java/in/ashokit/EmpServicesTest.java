package in.ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import in.ashokit.dao.EmpDao;
import in.ashokit.entity.Employee;
import in.ashokit.service.EmpServices;

@SpringBootTest
@ExtendWith(value = MockitoExtension.class)
public class EmpServicesTest {
	
	@MockBean
	EmpDao empDao;
	
	@InjectMocks
	EmpServices empServices;

	@Test
	public void testFindEmp() {
		
		Employee e = new Employee(1, "Dummy", 1000.00);
		
		when(empDao.getEmployee()).thenReturn(e);
		
		Employee emp = empServices.findEmp();
		
		assertEquals(e, emp);
	}
	
	@Test
	public void testAddEmp() {
		
		Employee e = new Employee(1, "Dummy", 1000.00);
		
		when(empDao.save(e)).thenReturn("EmpSavedd");
		
		String emp = empServices.addEmp(e);
		
		assertEquals("EmpSavedd", emp);
	}
	
}
