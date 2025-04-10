package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpRepo empRepo;

	@Override
	public Boolean addEmployee(Employee emp) {
		Employee save = empRepo.save(emp);
		return save.getId()!=null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empRepo.findAll();
	}

	@Override
	public Employee getEmpById(Integer id) {
		return empRepo.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		empRepo.deleteById(id);

	}

}
