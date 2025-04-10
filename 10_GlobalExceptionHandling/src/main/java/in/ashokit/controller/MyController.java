package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.exceptions.ProductNotFoundException;

@Controller
public class MyController {

	@GetMapping("/home")
	public String m1(Model m) {
		m.addAttribute("msg", "Welcome to ashok it");
		return "home";
	}
	
	
	@GetMapping("/welcome")
	public String m2(Model m) {
		int i = 10/0;
		m.addAttribute("msg", "Welcome");
		return "home";
	}
	
	@GetMapping("/greet")
	public String m3(Model m) {
		String s = null;
		s.length();
		m.addAttribute("msg", "Welcome");
		return "home";
	}
	
	
//	// class based exception handling
//	@ExceptionHandler(value = Exception.class)
//	public String m3(Model m,Exception e) {
//		m.addAttribute("msg", "Something went wrong");
//		return "error";
//	}
	
	@GetMapping("/product")
	public String m4(@RequestParam("pid") Integer pid, Model m) {
		if(pid == 1) {
			m.addAttribute("msg", "Product found ----- Apple");
		}else {
			throw new ProductNotFoundException("Having issues in product");
		}
		return "home";
	}
	

}
