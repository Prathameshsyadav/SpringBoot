package in.ashokit;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.assertj.MockMvcTester.MockMvcRequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.controller.EmpController;
import in.ashokit.dao.EmpDao;
import in.ashokit.entity.Employee;
import in.ashokit.service.EmpServices;

@WebMvcTest(value = EmpController.class)
public class EmpControllerTest {

	@MockBean
	EmpServices empServices;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetEmp() throws Exception {
		Employee emp = new Employee(1, "DummyEmp", 15000.00);
		when(empServices.findEmp()).thenReturn(emp);
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/emp");
		
		ResultActions perform = mockMvc.perform(request);
		
		MvcResult result = perform.andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(200, status);		
	}
	
	@Test
	public void testAddEmployee() throws Exception {
		
		Employee e = new Employee(2,"Dummy name",1000.00);
		
		
		when(empServices.addEmp(any(Employee.class))).thenReturn("EmpSaved");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String writeValueAsString = mapper.writeValueAsString(e);
		
		MockHttpServletRequestBuilder post = MockMvcRequestBuilders.post("/emp").contentType("application/json").content(writeValueAsString);
		
		
		ResultActions perform = mockMvc.perform(post);
		
		MvcResult andReturn = perform.andReturn();
		
		
		MockHttpServletResponse response = andReturn.getResponse();
		
		
		String contentAsString = response.getContentAsString();
		
		assertEquals("Employee saved", contentAsString);
	}
	
	@Test
	public void testAddEmployee1() throws Exception {
		
		Employee e = new Employee(2,"Dummy name",1000.00);
		
		
		when(empServices.addEmp(any(Employee.class))).thenReturn("Emp Not Saved");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String writeValueAsString = mapper.writeValueAsString(e);
		
		MockHttpServletRequestBuilder post = MockMvcRequestBuilders.post("/emp").contentType("application/json").content(writeValueAsString);
		
		
		ResultActions perform = mockMvc.perform(post);
		
		MvcResult andReturn = perform.andReturn();
		
		
		MockHttpServletResponse response = andReturn.getResponse();
		
		
		String contentAsString = response.getContentAsString();
		
		assertEquals("Emp Not Saved", contentAsString);
	}
	
}
