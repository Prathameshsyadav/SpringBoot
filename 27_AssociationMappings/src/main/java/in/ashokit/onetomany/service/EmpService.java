package in.ashokit.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.onetomany.entity.Address;
import in.ashokit.onetomany.entity.Employee;
import in.ashokit.onetomany.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo empRepo;
	
	public void m1() {
		
		Employee e = new Employee();
		e.setName("Advay");
		e.setSalary(10000.00);
		
		Employee e1 = new Employee();
		e1.setName("Nanu");
		e1.setSalary(17000.00);
		
		Address a1 = new Address();
		a1.setCityName("Ambernath");
		a1.setEmployee(e1);
		
		Address a2 = new Address();
		a2.setCityName("Dombivali");
		a2.setEmployee(e1);
		
		Address a3 = new Address();
		a3.setCityName("Lonavala");
		a3.setEmployee(e);
		
		e1.setAddress(List.of(a1,a2));
		
		e.setAddress(List.of(a3));
		
		empRepo.save(e);
		empRepo.save(e1);
	}

}
