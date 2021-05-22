package com.mohit.lc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LcAppEmailServiceImpl implements LcAppEmailService {

	@Autowired
	JavaMailSender javaMailSender;

	@Override
	public void sendEmail(String userName, String email, String result) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(email);
		mailMessage.setSubject("Love App Calculator Result");
		mailMessage.setText("Hi " + userName + " Your love prediction is " + result);

		javaMailSender.send(mailMessage);

	}

}
