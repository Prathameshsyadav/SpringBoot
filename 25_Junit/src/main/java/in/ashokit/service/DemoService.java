package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	public String getWelcomeMsg() {
		return "Welcome";
	}
	
	public String getGreetMsg() {
		return "GoodMorning";
	}

}
