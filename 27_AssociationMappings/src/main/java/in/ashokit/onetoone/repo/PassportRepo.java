package in.ashokit.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.onetoone.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
