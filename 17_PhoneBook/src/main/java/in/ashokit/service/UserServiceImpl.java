package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.entity.User;
import in.ashokit.repo.ContactRepo;
import in.ashokit.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ContactRepo contactRepo;

	@Override
	public boolean registerUser(User user) {
		User u = userRepo.save(user);
		return u.getId()!=null;
	}

	@Override
	public User loginUser(String email, String password) {
		User byName = userRepo.findByEmail(email);
		return byName;
	}

	@Override
	public Contact addContact(Contact contact) {
		System.out.println("contact added");
		return contactRepo.save(contact);
	}

	@Override
	public List<Contact> getContact(User u) {
		return contactRepo.findByUser(u);
	}
	
	public User getUserById(Integer id) {
		 Optional<User> byId = userRepo.findById(id);
		 return byId.get();
	}

}
