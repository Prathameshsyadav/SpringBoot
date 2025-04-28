package in.ashokit.manytomany.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.manytomany.entity.Roles;
import in.ashokit.manytomany.entity.User;
import in.ashokit.manytomany.repo.RolesRepo;
import in.ashokit.manytomany.repo.UserRepo;

@Service
public class UserRoleService {

	@Autowired
	private UserRepo uRepo;
	
	@Autowired
	private RolesRepo rRepo;

	public void m1() {
		User u = new User();

		u.setuName("Goat");
		

		User u1 = new User();

		u1.setuName("Manoj");

		User u3 = new User();

		u3.setuName("Ashish");

		User u4 = new User();

		u4.setuName("Gaurav");

		Roles r = new Roles();

		r.setrName("admin");

		Roles r1 = new Roles();

		r1.setrName("HR");
		
		u.setRoles(Arrays.asList(r,r1));
		u1.setRoles(Arrays.asList(r));
		u3.setRoles(List.of(r1));
		u4.setRoles(List.of(r,r1));
		
		r.setUser(List.of(u,u1,u4));
		r1.setUser(List.of(u,u3,u4));
		
		List<User> saveAll = uRepo.saveAll(List.of(u,u1,u3,u4));
		
		List<Roles> saveAll2 = rRepo.saveAll(Arrays.asList(r,r1));
		
		
		if(saveAll != null && saveAll2 != null) {
			System.out.println("Users saved");
		}else {
			System.out.println("Users not saved");
		}
		

	}

}
