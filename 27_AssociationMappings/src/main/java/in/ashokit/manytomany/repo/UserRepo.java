package in.ashokit.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.manytomany.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
