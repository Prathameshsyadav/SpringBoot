package in.ashokit.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.onetoone.entity.Passport;
import in.ashokit.onetoone.entity.Person;
import in.ashokit.onetoone.repo.PersonRepo;

@Service
public class Services {
	
	@Autowired
	private PersonRepo personRepo;
	
	public void m1() {
		
		Person p = new Person();
		
		p.seteName("Prathamesh");
		p.seteAdd("Pune");
		
		Passport pa = new Passport();
		pa.setPassNumber("5fsd565fs");
		
		pa.setPerson(p);
		p.setPassport(pa);
		
		personRepo.save(p);
		
	}
	

}
