package com.ku.dku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ku.dku.entity.TxOfficer;
import com.ku.dku.repository.TxOfficerRepository;

@Service
public class NotificationService {
	
	private JavaMailSender javaMailSender;
	@Autowired private TxOfficerRepository txOfficerRepository;
	
	static Integer num = 0;
	static Integer numRandom = 0;
	static String randomNumber = "";
	String userEmail = null;

	public NotificationService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	public int random() {
		num = (int) (Math.random() * 9999);

		return num;

	}
	
	public void sendMail(TxOfficer officer) throws MailException {
		SimpleMailMessage mailMessage = new SimpleMailMessage();

//		SecureRandom random = new SecureRandom();

		numRandom = random();
		if (numRandom > 999 && numRandom <= 10000) {
			randomNumber = Integer.toString(numRandom);

			System.out.println(num);

			mailMessage.setFrom("testacct892@gmail.com");
			mailMessage.setTo(officer.getOfficerEmail());

			mailMessage.setSubject("Code to Reset Password");

			mailMessage.setText(" Please use this code to set up on account password " + officer.getOfficerEmail()
					+ " \n\nThis is your code: " + randomNumber + "\n\nthank you");

			javaMailSender.send(mailMessage);
			userEmail = officer.getOfficerEmail();
			System.out.println(userEmail);
			System.out.println(randomNumber);

			try {

				saveData(userEmail, randomNumber);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void saveData(String officerEmail, String randomNumber) {
		System.out.println(officerEmail);
		TxOfficer txOfficer = txOfficerRepository.findByOfficerEmail(officerEmail);
		System.out.println(txOfficer);
		
		txOfficer.setOfficerOtp(randomNumber);
		txOfficerRepository.save(txOfficer);

	}
	
	
}
