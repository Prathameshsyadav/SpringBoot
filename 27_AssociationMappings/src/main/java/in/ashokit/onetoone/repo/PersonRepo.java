package in.ashokit.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.onetoone.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
