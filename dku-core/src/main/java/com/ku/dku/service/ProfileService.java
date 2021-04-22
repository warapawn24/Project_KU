package com.ku.dku.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ku.dku.bean.AdminUpdateDataStudentRequest;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.TxStudentRepository;

@Service
public class ProfileService {

	@Autowired private TxStudentRepository txStudentRepository;
	
	public TxStudent profile(long studentId) {
		
		TxStudent txStudent = txStudentRepository.findByStudentId(studentId);
		return txStudent;		
	}
	
	
	//แอดมินเพิ่มข้อมูลนิสิต
	
	public boolean updateStudentData(List<AdminUpdateDataStudentRequest> studentDataRequest) throws ParseException {
	
		List<AdminUpdateDataStudentRequest> listData = studentDataRequest;
		for (int i = 0; i < listData.size(); i++) {
			
			AdminUpdateDataStudentRequest addData = listData.get(i);
			
			TxStudent txStudent = new TxStudent();
			txStudent.setFacultyCode(addData.getFacultyCode());
			txStudent.setStudentBranch(addData.getStudentBranch());
			txStudent.setStudentEmail(addData.getStudentEmail());
			txStudent.setStudentFaculty(addData.getStudentFaculty());
			txStudent.setStudentFail(addData.getStudentFail());
			txStudent.setStudentFname(addData.getStudentFname());
			txStudent.setStudentId(addData.getStudentId());
			txStudent.setStudentLname(addData.getStudentLname());
			
			String pattern = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern ,new Locale("en", "EN"));
			
			Date date = simpleDateFormat.parse(addData.getStudentLogindate());
			
			txStudent.setStudentLogindate(date);
			txStudent.setStudentPassword(addData.getStudentPassword());
			txStudent.setStudentRoom(addData.getRoomId());
			txStudent.setStudentStatus(addData.getStudentStatus());
			txStudent.setStudentUsername(addData.getStudentUsername());
			txStudent.setStudentPhone("0");
			
			txStudentRepository.save(txStudent);
			
			
		}
		
		
		return true;
	
		
	}
}
