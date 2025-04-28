package in.ashokit.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.manytomany.entity.Roles;

public interface RolesRepo extends JpaRepository<Roles, Integer> {

}
