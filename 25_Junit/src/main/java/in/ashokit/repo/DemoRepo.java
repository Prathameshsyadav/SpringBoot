package in.ashokit.repo;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepo {
	
	public String findUserById(Integer id) {
		return "John";
	}

}
