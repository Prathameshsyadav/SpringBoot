package in.ashokit.service;

import in.ashokit.entity.User;

public interface UserService {
	
	public boolean registerUser(User user);
	
	public User loginUser(String email, String password);

}
