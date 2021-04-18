package com.emipaylelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import com.emipaylelo.model.User;
@Component
public class EmailServiceImpl{
	
	@Autowired
	private MailSender mailSender; 
	
	public void sendEmail(User user, String subject, String text) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("emipaylelo@gmail.com");
		message.setTo(user.getUserEmail());
		message.setSubject(subject);
		message.setText(text);
		mailSender.send(message);

	}

	

}
