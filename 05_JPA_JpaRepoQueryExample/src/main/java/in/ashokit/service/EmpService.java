package in.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {

	public static final Integer pageSize = 2;

	private EmpRepo empRepo;

	public EmpService(EmpRepo empRepo) {
		this.empRepo = empRepo;
	}

//	public void getAllEmp() {
//		List<Employee> all = empRepo.findAll();
//		all.forEach(System.out::println);
//	}

	public void getAllEmpPage(Integer pageNumber) {

		PageRequest pageRequest = PageRequest.of(pageNumber - 1, pageSize);

		Page<Employee> all = empRepo.findAll(pageRequest);

		all.forEach(System.out::println);

	}

	public void getEmpByExample(Employee e) {

		Example<Employee> of = Example.of(e);

		List<Employee> all = empRepo.findAll(of);

		all.forEach(System.out::println);
	}

}
