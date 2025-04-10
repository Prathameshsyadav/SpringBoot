package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Employee;
import jakarta.transaction.Transactional;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
	
	

}
