package in.ashokit.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.onetomany.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
