package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Students;

public interface StudentRepo extends CrudRepository<Students, Integer> {

}
