package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import in.ashokit.data.Employee;
import in.ashokit.service.RestConsumerService;

@Controller
public class ConsumerController {

	@Autowired
	RestConsumerService conService;

	@GetMapping("/")
	public String homePage(Model m) {

		Employee[] getAllEmployee = conService.callGetAllEmployee();

		m.addAttribute("allEmployees", getAllEmployee);

		return "homePage";

	}

	@PostMapping("/saveEmp")
	public String handleEmployee(@ModelAttribute Employee e, Model m) {

		String employee = conService.callAddEmployee(e);

		m.addAttribute("employee", employee);
		m.addAttribute("e", e);

		return "addEmployee";
	}

	@GetMapping("/displayform")
	public String employeePage(Model m, Employee e) {

		m.addAttribute("employee", "Add Employee");
		m.addAttribute("e", e);

		return "addEmployee";
	}

	@GetMapping("/edit/{id}")
	public String showEditForm(@PathVariable Integer id, Model m) {

		Employee employee = conService.callGetSingleEmployee(id);

		m.addAttribute("e", employee);
		m.addAttribute("employee", "Update Employee");

		return "addEmployee";

	}
	
	@GetMapping("/delete/{id}")
	public String handleDelete(@PathVariable Integer id, Model m) {

		conService.callDeleteForEmployee(id);
		
		Employee[] getAllEmployee = conService.callGetAllEmployee();

		m.addAttribute("allEmployees", getAllEmployee);
		
		return "homePage";
		
		
	}

}
