package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {
	
	private EmpRepo empRepo;
	
	

	public EmpServiceImpl(EmpRepo empRepo) {
		
		this.empRepo = empRepo;
	}



	@Override
	public List<Employee> getEmployees() {
		return empRepo.findAll();
	}

}
