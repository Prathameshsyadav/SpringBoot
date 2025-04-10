package in.ashokit.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;



@Service
public class MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void simpleMailSender(String to, String subject, String body) {
		
		SimpleMailMessage m = new SimpleMailMessage();
		m.setSubject(subject);
		m.setTo(to);
		m.setText(body);
		
		javaMailSender.send(m);
		
	}
	
	public void mimeMailSender(String to, String subject, String body) {
		
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		
		try {
			MimeMessageHelper m = new MimeMessageHelper(mimeMessage, true);
			m.setSubject(subject);
			m.setTo(to);
			m.setText(body,true);
			m.addAttachment("Ajax", new File("D:\\Ashok it\\JRTP\\notes\\Ajax.txt"));
			System.out.println("mimemessageSender() callled");
			javaMailSender.send(mimeMessage);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
