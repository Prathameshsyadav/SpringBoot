package in.ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.ashokit.dao.EmpDao;
import in.ashokit.entity.Employee;

@SpringBootTest
public class EmpDaoTest {
	
	@Autowired
	private EmpDao empDao;
	
	@Test
	public void testGetEmployee() {
		
		Employee employee = empDao.getEmployee();
		
		assertNotNull(employee);
		
	}
	
	@Test
	public void testSave() {
		Employee e = new Employee(1,"Dummy Emp", 1000.00);
		String save = empDao.save(e);
		assertEquals("EmpSaved", save);
		
	}

}
