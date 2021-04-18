package com.ku.dku.service;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.MsRoom;
import com.ku.dku.entity.TxReserve;
import com.ku.dku.entity.TxReserveDetail;
import com.ku.dku.entity.TxSetDate;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.MsBuildingRepository;
import com.ku.dku.repository.MsRoomRepository;
import com.ku.dku.repository.TxReserveDetailRepository;
import com.ku.dku.repository.TxReserveRepository;
import com.ku.dku.repository.TxSetDateRepository;
import com.ku.dku.repository.TxStudentRepository;

@Service
public class BookRooomService {
	
	@Autowired private MsBuildingRepository msBuildingRepository;
	@Autowired private MsRoomRepository msRoomRepository;
	@Autowired private TxReserveDetailRepository txReserveDetailRepository;
	@Autowired private TxReserveRepository txReserveRepository;
	@Autowired private TxStudentRepository txStudentRepository;
	@Autowired private TxSetDateRepository txSetDateRepository;
	
	
	public boolean bookRoom(long roomId,long studentId) {
		MsRoom msRoom = msRoomRepository.findByRoomId(roomId);
		
		Integer amountPeople = msRoom.getRoomStatus();
		
		TxStudent txStudent = txStudentRepository.findByStudentId(studentId);
		
		long millies = System.currentTimeMillis();
		Date date = new Date(millies);
		
		
	
		
		Integer sumPeopele = 0;
	
		if (amountPeople < 4) {
			
			
			TxReserve txReserve = new TxReserve();
			txReserve.setBuildingId(msRoom.getBuildingId());
			txReserve.setRoomId(roomId);
			txReserve.setReserveDate(date);
			txReserve.setReserveDuedate(date);
			sumPeopele = msRoom.getRoomStatus()+1;
			System.out.println("ms"+msRoom.getRoomStatus());
			System.out.println("sum"+sumPeopele);
			txReserve.setReserveRoomstatus(sumPeopele);
			txReserve.setReserveStatus("Unpaid");
			txReserveRepository.save(txReserve);
			
			TxReserveDetail txReserveDetail = new TxReserveDetail();
			txReserveDetail.setReserveId(txReserve.getRecId());
			txReserveDetail.setStudentId(studentId);
			txReserveDetail.setStudentFname(txStudent.getStudentFname());
			txReserveDetail.setStudentLname(txStudent.getStudentLname());
			txReserveDetailRepository.save(txReserveDetail);
			
			TxStudent studentUpdate = txStudentRepository.findByStudentId(studentId);
//			String studentRoom = Long.toString(roomId);
			studentUpdate.setStudentRoom(roomId);
			txStudentRepository.save(studentUpdate);
			
			msRoom.setRoomStatus(sumPeopele);
			msRoomRepository.save(msRoom);
			
					
		}if (amountPeople == 4)  {
			return false;
		}
		return true;
		}
	
	
	
		//ส่งStatusและระยะเวลาจองหอ
	public boolean checkStatusStudent(long studentId) {
		
		TxStudent student = txStudentRepository.findByStudentId(studentId);
		
		
		
		return true;
		
	}
	
	public TxSetDate TopDateData() {
		return txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
		
	}
	
	public TxStudent findByStudentId(long studentId) {
		return txStudentRepository.findByStudentId(studentId);
	}
	
	//SetDate
	public boolean setDate(TxSetDate date) {
		
		TxSetDate txSetDate = new TxSetDate();
		txSetDate.setTermId(date.getTermId());
		txSetDate.setSetReserveStart(date.getSetReserveStart());
		txSetDate.setSetReserveDue(date.getSetReserveDue());
		txSetDate.setYear(date.getYear());
		txSetDate.setSetPaymentstart(date.getSetReserveStart());
		txSetDate.setSetPaymentDue(date.getSetReserveDue());
		txSetDate.setSetStatus(LookupConstant.SET_DATE_STATUS_OPEN);
		
		txSetDateRepository.save(txSetDate);
		
		return true;
		
		
		
	}
}
