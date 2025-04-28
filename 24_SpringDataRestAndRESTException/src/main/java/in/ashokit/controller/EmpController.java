package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Employee;
import in.ashokit.exception.EmpNotFoundException;
import in.ashokit.repo.EmpRepo;

@RestController
public class EmpController {
	
	@Autowired
    private EmpRepo repo;

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable Integer id) throws Exception {
       if(id==99) {
    	   throw new EmpNotFoundException("Employee not found");
       }else if(id==100){
    	   throw new Exception("Something went wrong");
       }
       return repo.findById(id).get();
       
    }

}
