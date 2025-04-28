package in.ashokit.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.onetomany.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
