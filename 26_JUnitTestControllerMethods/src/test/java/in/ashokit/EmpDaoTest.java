package in.ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

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
	
	@Test
	public void testGetAllEmployee() throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		 Method method = EmpDao.class.getDeclaredMethod("getAllEmployee");
		 
		 method.setAccessible(true);
		 
		 List<Employee> emps = (List<Employee>) method.invoke(empDao);
		 
		 assertNotNull(emps);
		 
		
	}

}
