package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.repo.DemoRepo;

@Service
public class DemoService1 {

	@Autowired
	private DemoRepo demoRepo;
	
	public String m1(Integer id) {
		String userById = demoRepo.findUserById(id);
		return userById;
	}
}
