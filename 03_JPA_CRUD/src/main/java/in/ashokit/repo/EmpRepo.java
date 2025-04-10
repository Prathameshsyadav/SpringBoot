package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer> {
	
	//HQL
	//Select * from employee
	@Query("FROM Employee")
	public List<Employee> getAllEmployees();
	
	@Query("FROM Employee where eAddress=:city")
	public List<Employee> getEmployeeByCity(String city);
	
	@Query("FROM Employee where eAddress=:city and eSalary>=:salary")
	public List<Employee> getEmployeeByCityAndSalaryGreaterThan(String city, Double salary);
	
	
	
	//sql
	@Query(value = "Select * from employee" , nativeQuery = true)
	public List<Employee> getAllEmployeesSQL();

}
