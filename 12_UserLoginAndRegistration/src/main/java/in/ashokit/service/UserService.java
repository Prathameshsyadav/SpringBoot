package in.ashokit.service;

import in.ashokit.entity.User;

public interface UserService {
	
	public boolean registerUser(User user);
	
	public boolean loginUser(String name, String password);

}
