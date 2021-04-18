package com.ku.dku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.TxLoginAdmin;
import com.ku.dku.entity.TxLoginStudent;
import com.ku.dku.entity.TxOfficer;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.TxLoginAdminRepository;
import com.ku.dku.repository.TxLoginStudentRepository;
import com.ku.dku.repository.TxOfficerRepository;
import com.ku.dku.repository.TxStudentRepository;

import java.sql.Date;

@Service
public class LoginService {

	@Autowired private TxStudentRepository studentRepository;
	@Autowired private TxLoginStudentRepository loginStudentRepository;
	@Autowired private TxOfficerRepository txOfficerRepository;
	@Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired private TxLoginAdminRepository txLoginAdmin;
	
	@Transactional
	public boolean login(TxStudent student,String loginForm) {
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
				login.setLoginForm(loginForm);
				login.setLoginError(LookupConstant.TX_LOGIN_ERROR_Y);
				loginStudentRepository.save(login);
				
				check.setStudentLogindate(date);
				studentRepository.save(check);
			


			} else {
				login.setStudentId(check.getStudentId());
				login.setLoginTime(date);
				login.setStudentPassword(check.getStudentPassword());
				login.setStudentUsername(check.getStudentUsername());
				login.setLoginForm(loginForm);
				login.setLoginError(LookupConstant.TX_LOGIN_ERROR_N);
				loginStudentRepository.save(login);
				
				Long num = (check.getStudentFail() + 1);

				check.setStudentFail(num);
				studentRepository.save(check);
				
				return false;
			}

		}
		return true;
	}
	
	public boolean adminLogin(TxOfficer officer,String loginForm) {
		TxOfficer check = txOfficerRepository.findByOfficerUsername(officer.getOfficerUsername());
		
		TxLoginAdmin log = new TxLoginAdmin();
		long millies = System.currentTimeMillis();

		Date date = new Date(millies);
		
		if (check == null) {

			return false;
		}

		
		Integer loginfirstchange = 0;
		if (check != null) {
			if (bCryptPasswordEncoder.matches(officer.getOfficerPassword(), check.getOfficerPassword())
					&& officer.getOfficerUsername().equals(check.getOfficerUsername())) {
				log.setOfficerUsername(check.getOfficerUsername());
				log.setOfficerId(check.getOfficerId());
				log.setOfficerPassword(check.getOfficerPassword());
				
				check.setOfficerLogindate(date);
				loginfirstchange = check.getOfficerLoginfirstchange() + 1;
				check.setOfficerLoginfirstchange(loginfirstchange);
				if (check.getOfficerLoginfirstchange() == 1) {
					check.setOfficerLogindate(date);
				}
				log.setLoginTime(date);
				log.setLoginForm(loginForm);
				log.setLoginError(LookupConstant.TX_LOGIN_ERROR_Y);

				txLoginAdmin.save(log);

			} else {
				int num = (check.getOfficerFail() + 1);

				check.setOfficerFail(num);
				txOfficerRepository.save(check);
				log.setOfficerUsername(check.getOfficerUsername());
				log.setOfficerId(check.getOfficerId());
				log.setOfficerPassword(check.getOfficerPassword());
				log.setLoginTime(date);
				log.setLoginForm(loginForm);
				log.setLoginError(LookupConstant.TX_LOGIN_ERROR_N);
				txLoginAdmin.save(log);
				return false;
			}

		}
		return true;
		
		
		
		
		
	}
}

