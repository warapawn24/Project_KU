package com.ku.dku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ku.dku.entity.TxLoginStudent;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.TxLoginStudentRepository;
import com.ku.dku.repository.TxStudentRepository;

import java.sql.Date;

@Service
public class LoginService {

	@Autowired private TxStudentRepository studentRepository;
	@Autowired private TxLoginStudentRepository loginStudentRepository;
	
	@Transactional
	public boolean login(TxStudent student) {
		TxStudent check = studentRepository.findByStudentUsername(student.getStudentUsername());
		
		TxLoginStudent login = new TxLoginStudent();

		long millies = System.currentTimeMillis();

		Date date = new Date(millies);

		if (check == null) {

			return false;
		}

		
		if (check != null) {
			if (check.getStudentPassword().equals(student.getStudentPassword())&& check.getStudentUsername().equals(student.getStudentUsername())) {
				
				login.setStudentId(check.getStudentId());
				login.setLoginTime(date);
				login.setStudentPassword(check.getStudentPassword());
				login.setStudentUsername(check.getStudentUsername());
				login.setLoginError("Y");
				loginStudentRepository.save(login);
				
				check.setStudentLogindate(date);
				studentRepository.save(check);
			


			} else {
				login.setStudentId(check.getStudentId());
				login.setLoginTime(date);
				login.setStudentPassword(check.getStudentPassword());
				login.setStudentUsername(check.getStudentUsername());
				login.setLoginError("N");
				loginStudentRepository.save(login);
				
				Long num = (check.getStudentFail() + 1);

				check.setStudentFail(num);
				studentRepository.save(check);
				
				return false;
			}

		}
		return true;


	}
}
