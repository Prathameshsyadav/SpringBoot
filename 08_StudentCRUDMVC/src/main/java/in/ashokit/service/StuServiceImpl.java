package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repo.StuRepo;

@Service
public class StuServiceImpl implements StuService {
	
	private StuRepo stuRepo;
	
	

	public StuServiceImpl(StuRepo stuRepo) {
		this.stuRepo = stuRepo;
	}

	@Override
	public Boolean addStudent(Student student) {
		Student save = stuRepo.save(student);
		return save.getSid() != null;
	}

	@Override
	public List<Student> getAllStudent() {
		return stuRepo.findAll();
	}

	@Override
	public void deleteStudent(Integer sid) {
		stuRepo.deleteById(sid);
		
	}

}
