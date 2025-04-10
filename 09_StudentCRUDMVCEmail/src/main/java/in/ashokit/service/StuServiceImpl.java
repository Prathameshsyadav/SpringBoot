package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repo.StuRepo;

@Service
public class StuServiceImpl implements StuService {
	
	private StuRepo stuRepo;
	
	private MailService mailService;
	
	

	public StuServiceImpl(StuRepo stuRepo, MailService mailService) {
		this.stuRepo = stuRepo;
		this.mailService = mailService;
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
	
	public void sendSimpleMail(Student student) {
		mailService.simpleMailSender(student.getEmail(), "Welcome to Ashok IT", "You have enrolled our course.");
	}

	@Override
	public void sendMimeMail(Student student) {
		mailService.mimeMailSender(student.getEmail(), "Welcome to Ashok IT Mime", "<body> <h1> <font style='color : red'> Hello Prathamesh <font> </h1> </body>");
		System.out.println("mimemail() called");
		
	}

}
