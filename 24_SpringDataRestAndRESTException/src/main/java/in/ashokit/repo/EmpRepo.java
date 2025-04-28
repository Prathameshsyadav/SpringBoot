package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import in.ashokit.entity.Employee;

@RepositoryRestResource(path = "emp")
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
