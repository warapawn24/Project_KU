 package com.ku.dku.service;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.MsBuildingEight;
import com.ku.dku.entity.MsBuildingFive;
import com.ku.dku.entity.MsBuildingFour;
import com.ku.dku.entity.MsBuildingOne;
import com.ku.dku.entity.MsBuildingSeven;
import com.ku.dku.entity.MsBuildingSix;
import com.ku.dku.entity.MsBuildingThree;
import com.ku.dku.entity.MsBuildingTwo;
import com.ku.dku.entity.MsFee;
import com.ku.dku.entity.MsRoom;
import com.ku.dku.entity.MsRunningNumber;
import com.ku.dku.entity.TxReserve;
import com.ku.dku.entity.TxReserveDetail;
import com.ku.dku.entity.TxSetDate;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.entity.TxUtilityBill;
import com.ku.dku.repository.MsBuildingEightRepository;
import com.ku.dku.repository.MsBuildingFiveRepository;
import com.ku.dku.repository.MsBuildingFourRepository;
import com.ku.dku.repository.MsBuildingOneRepository;
import com.ku.dku.repository.MsBuildingRepository;
import com.ku.dku.repository.MsBuildingSevenRepository;
import com.ku.dku.repository.MsBuildingSixRepository;
import com.ku.dku.repository.MsBuildingThreeRepository;
import com.ku.dku.repository.MsBuildingTwoRepository;
import com.ku.dku.repository.MsFeeRepository;
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
	@Autowired private RunningNumberService runningNumberService;
	
	@Autowired private MsBuildingEightRepository msBuildingEightRepository;
	@Autowired private MsBuildingFiveRepository msBuildingFiveRepository;
	@Autowired private MsBuildingFourRepository msBuildingFourRepository;	
	@Autowired private MsBuildingOneRepository	msBuildingOneRepository;
	@Autowired private MsBuildingSevenRepository msBuildingSevenRepository;
	@Autowired private MsBuildingSixRepository msBuildingSixRepository;
	@Autowired private MsBuildingThreeRepository msBuildingThreeRepository;
	@Autowired private MsBuildingTwoRepository msBuildingTwoRepository;
	
	@Autowired private MsFeeRepository msFeeRepository;

	
	
	
	
	public boolean bookRoom(long buildingId,long roomId,TxReserve reserve) {
		
		long millies = System.currentTimeMillis();
		Date date = new Date(millies);
		
		Integer building = (int) buildingId;
		switch (building) {
		
		 case 1:

			 	MsBuildingOne msBuildingOne = msBuildingOneRepository.findByRoomId(roomId);
			 	if (msBuildingOne.getNumber()<msBuildingOne.getBuildingTotal()) {
			 		
			 		Integer Availability = msBuildingOne.getNumber()+1;
			 		
			 		TxReserve txReserve = new TxReserve();
			 		txReserve.setBuildingId(buildingId);
			 		txReserve.setBuildingTypeId(msBuildingOne.getTypeId());
			 		txReserve.setRoomId(roomId);
			 		txReserve.setStudentId(reserve.getStudentId());
			 		txReserve.setStudentFname(reserve.getStudentFname());
			 		txReserve.setStudentLname(reserve.getStudentLname());

			 		TxSetDate setDate = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 		txReserve.setSetPaymentDue(setDate.getSetPaymentDue());
			 		txReserve.setSetPaymentstart(setDate.getSetPaymentstart());
			 		txReserve.setYear(setDate.getYear());
			 		
			 		long termId = setDate.getTermId();
			 		
			 		MsFee fee = msFeeRepository.findByTermIdANDTypeId(termId, msBuildingOne.getTypeId());
			 		txReserve.setFeeId(fee.getRecId());
			 		txReserve.setReserveDate(date);
			 		txReserve.setReserveRoomstatus(Availability);
			 		txReserve.setReserveStatus(LookupConstant.RESERVE_STATUS_UNPAID);
			 		txReserveRepository.save(txReserve);
			 		
			 		TxStudent student = txStudentRepository.findByStudentId(reserve.getStudentId());
			 		student.setStudentRoom(roomId);
			 		txStudentRepository.save(student);
			 		
			 		//saveจำนวนลงที่เดิม
			 		msBuildingOne.setNumber(Availability);
			 		msBuildingOneRepository.save(msBuildingOne);
			 		
			 		return true;
				}
			 	
			 	
			    break;
			   
		 case 2:

			 	MsBuildingTwo msBuildingTwo = msBuildingTwoRepository.findByRoomId(roomId);
			 	if (msBuildingTwo.getNumber()<msBuildingTwo.getBuildingTotal()) {
			 		
			 		Integer Availability = msBuildingTwo.getNumber()+1;
			 		
			 		TxReserve txReserve = new TxReserve();
			 		txReserve.setBuildingId(buildingId);
			 		txReserve.setBuildingTypeId(msBuildingTwo.getTypeId());
			 		txReserve.setRoomId(roomId);
			 		txReserve.setStudentId(reserve.getStudentId());
			 		txReserve.setStudentFname(reserve.getStudentFname());
			 		txReserve.setStudentLname(reserve.getStudentLname());

			 		TxSetDate setDate = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 		txReserve.setSetPaymentDue(setDate.getSetPaymentDue());
			 		txReserve.setSetPaymentstart(setDate.getSetPaymentstart());
			 		txReserve.setYear(setDate.getYear());
			 		
			 		long termId = setDate.getTermId();
			 		
			 		MsFee fee = msFeeRepository.findByTermIdANDTypeId(termId, msBuildingTwo.getTypeId());
			 		txReserve.setFeeId(fee.getRecId());
			 		txReserve.setReserveDate(date);
			 		txReserve.setReserveRoomstatus(Availability);
			 		txReserve.setReserveStatus(LookupConstant.RESERVE_STATUS_UNPAID);
			 		txReserveRepository.save(txReserve);
			 		
			 		//saveจำนวนลงที่เดิม
			 		msBuildingTwo.setNumber(Availability);
			 		msBuildingTwoRepository.save(msBuildingTwo);
			 		
			 		TxStudent student = txStudentRepository.findByStudentId(reserve.getStudentId());
			 		student.setStudentRoom(roomId);
			 		txStudentRepository.save(student);
			 		
			 		return true;
				}
			 	
			    break;
		 case 3:

			 	MsBuildingThree msBuildingThree = msBuildingThreeRepository.findByRoomId(roomId);
			 	if (msBuildingThree.getNumber()<msBuildingThree.getBuildingTotal()) {
			 		
			 		Integer Availability = msBuildingThree.getNumber()+1;
			 		
			 		TxReserve txReserve = new TxReserve();
			 		txReserve.setBuildingId(buildingId);
			 		txReserve.setBuildingTypeId(msBuildingThree.getTypeId());
			 		txReserve.setRoomId(roomId);
			 		txReserve.setStudentId(reserve.getStudentId());
			 		txReserve.setStudentFname(reserve.getStudentFname());
			 		txReserve.setStudentLname(reserve.getStudentLname());

			 		TxSetDate setDate = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 		txReserve.setSetPaymentDue(setDate.getSetPaymentDue());
			 		txReserve.setSetPaymentstart(setDate.getSetPaymentstart());
			 		txReserve.setYear(setDate.getYear());
			 		
			 		long termId = setDate.getTermId();
			 		
			 		MsFee fee = msFeeRepository.findByTermIdANDTypeId(termId, msBuildingThree.getTypeId());
			 		txReserve.setFeeId(fee.getRecId());
			 		txReserve.setReserveDate(date);
			 		txReserve.setReserveRoomstatus(Availability);
			 		txReserve.setReserveStatus(LookupConstant.RESERVE_STATUS_UNPAID);
			 		txReserveRepository.save(txReserve);
			 		
			 		//saveจำนวนลงที่เดิม
			 		msBuildingThree.setNumber(Availability);
			 		msBuildingThreeRepository.save(msBuildingThree);
			 		
			 		TxStudent student = txStudentRepository.findByStudentId(reserve.getStudentId());
			 		student.setStudentRoom(roomId);
			 		txStudentRepository.save(student);
			 		
			 		return true;
				}
			    break;
		 case 4:

			 	MsBuildingFour msBuildingFour = msBuildingFourRepository.findByRoomId(roomId);
			 	if (msBuildingFour.getNumber()<msBuildingFour.getBuildingTotal()) {
			 		
			 		Integer Availability = msBuildingFour.getNumber()+1;
			 		
			 		TxReserve txReserve = new TxReserve();
			 		txReserve.setBuildingId(buildingId);
			 		txReserve.setBuildingTypeId(msBuildingFour.getTypeId());
			 		txReserve.setRoomId(roomId);
			 		txReserve.setStudentId(reserve.getStudentId());
			 		txReserve.setStudentFname(reserve.getStudentFname());
			 		txReserve.setStudentLname(reserve.getStudentLname());

			 		TxSetDate setDate = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 		txReserve.setSetPaymentDue(setDate.getSetPaymentDue());
			 		txReserve.setSetPaymentstart(setDate.getSetPaymentstart());
			 		txReserve.setYear(setDate.getYear());
			 		
			 		long termId = setDate.getTermId();
			 		
			 		MsFee fee = msFeeRepository.findByTermIdANDTypeId(termId, msBuildingFour.getTypeId());
			 		txReserve.setFeeId(fee.getRecId());
			 		txReserve.setReserveDate(date);
			 		txReserve.setReserveRoomstatus(Availability);
			 		txReserve.setReserveStatus(LookupConstant.RESERVE_STATUS_UNPAID);
			 		txReserveRepository.save(txReserve);
			 		
			 		//saveจำนวนลงที่เดิม
			 		msBuildingFour.setNumber(Availability);
			 		msBuildingFourRepository.save(msBuildingFour);
			 		
			 		TxStudent student = txStudentRepository.findByStudentId(reserve.getStudentId());
			 		student.setStudentRoom(roomId);
			 		txStudentRepository.save(student);
			 		return true;
				}
			 	break;
		 case 5:

			 	MsBuildingFive msBuildingFive = msBuildingFiveRepository.findByRoomId(roomId);
			 	if (msBuildingFive.getNumber()<msBuildingFive.getBuildingTotal()) {
			 		
			 		Integer Availability = msBuildingFive.getNumber()+1;
			 		
			 		TxReserve txReserve = new TxReserve();
			 		txReserve.setBuildingId(buildingId);
			 		txReserve.setBuildingTypeId(msBuildingFive.getTypeId());
			 		txReserve.setRoomId(roomId);
			 		txReserve.setStudentId(reserve.getStudentId());
			 		txReserve.setStudentFname(reserve.getStudentFname());
			 		txReserve.setStudentLname(reserve.getStudentLname());

			 		TxSetDate setDate = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 		txReserve.setSetPaymentDue(setDate.getSetPaymentDue());
			 		txReserve.setSetPaymentstart(setDate.getSetPaymentstart());
			 		txReserve.setYear(setDate.getYear());
			 		
			 		long termId = setDate.getTermId();
			 		
			 		MsFee fee = msFeeRepository.findByTermIdANDTypeId(termId, msBuildingFive.getTypeId());
			 		txReserve.setFeeId(fee.getRecId());
			 		txReserve.setReserveDate(date);
			 		txReserve.setReserveRoomstatus(Availability);
			 		txReserve.setReserveStatus(LookupConstant.RESERVE_STATUS_UNPAID);
			 		txReserveRepository.save(txReserve);
			 		
			 		//saveจำนวนลงที่เดิม
			 		msBuildingFive.setNumber(Availability);
			 		msBuildingFiveRepository.save(msBuildingFive);
			 		
			 		TxStudent student = txStudentRepository.findByStudentId(reserve.getStudentId());
			 		student.setStudentRoom(roomId);
			 		txStudentRepository.save(student);
			 		
			 		return true;
				}
			    break;
			    
		 case 6:

			 	MsBuildingSix msBuildingSix = msBuildingSixRepository.findByRoomId(roomId);
			 	if (msBuildingSix.getNumber()<msBuildingSix.getBuildingTotal()) {
			 		
			 		Integer Availability = msBuildingSix.getNumber()+1;
			 		
			 		TxReserve txReserve = new TxReserve();
			 		txReserve.setBuildingId(buildingId);
			 		txReserve.setBuildingTypeId(msBuildingSix.getTypeId());
			 		txReserve.setRoomId(roomId);
			 		txReserve.setStudentId(reserve.getStudentId());
			 		txReserve.setStudentFname(reserve.getStudentFname());
			 		txReserve.setStudentLname(reserve.getStudentLname());

			 		TxSetDate setDate = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 		txReserve.setSetPaymentDue(setDate.getSetPaymentDue());
			 		txReserve.setSetPaymentstart(setDate.getSetPaymentstart());
			 		txReserve.setYear(setDate.getYear());
			 		
			 		long termId = setDate.getTermId();
			 		
			 		MsFee fee = msFeeRepository.findByTermIdANDTypeId(termId, msBuildingSix.getTypeId());
			 		txReserve.setFeeId(fee.getRecId());
			 		txReserve.setReserveDate(date);
			 		txReserve.setReserveRoomstatus(Availability);
			 		txReserve.setReserveStatus(LookupConstant.RESERVE_STATUS_UNPAID);
			 		txReserveRepository.save(txReserve);
			 		
			 		//saveจำนวนลงที่เดิม
			 		msBuildingSix.setNumber(Availability);
			 		msBuildingSixRepository.save(msBuildingSix);
			 		
			 		TxStudent student = txStudentRepository.findByStudentId(reserve.getStudentId());
			 		student.setStudentRoom(roomId);
			 		txStudentRepository.save(student);
			 		return true;
				}
			    break;
			    
		 case 7:

			 	MsBuildingSeven msBuildingSeven = msBuildingSevenRepository.findByRoomId(roomId);
			 	if (msBuildingSeven.getNumber()<msBuildingSeven.getBuildingTotal()) {
			 		
			 		Integer Availability = msBuildingSeven.getNumber()+1;
			 		
			 		TxReserve txReserve = new TxReserve();
			 		txReserve.setBuildingId(buildingId);
			 		txReserve.setBuildingTypeId(msBuildingSeven.getTypeId());
			 		txReserve.setRoomId(roomId);
			 		txReserve.setStudentId(reserve.getStudentId());
			 		txReserve.setStudentFname(reserve.getStudentFname());
			 		txReserve.setStudentLname(reserve.getStudentLname());

			 		TxSetDate setDate = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 		txReserve.setSetPaymentDue(setDate.getSetPaymentDue());
			 		txReserve.setSetPaymentstart(setDate.getSetPaymentstart());
			 		txReserve.setYear(setDate.getYear());
			 		
			 		long termId = setDate.getTermId();
			 		
			 		MsFee fee = msFeeRepository.findByTermIdANDTypeId(termId, msBuildingSeven.getTypeId());
			 		txReserve.setFeeId(fee.getRecId());
			 		txReserve.setReserveDate(date);
			 		txReserve.setReserveRoomstatus(Availability);
			 		txReserve.setReserveStatus(LookupConstant.RESERVE_STATUS_UNPAID);
			 		txReserveRepository.save(txReserve);
			 		
			 		//saveจำนวนลงที่เดิม
			 		msBuildingSeven.setNumber(Availability);
			 		msBuildingSevenRepository.save(msBuildingSeven);
			 		
			 		TxStudent student = txStudentRepository.findByStudentId(reserve.getStudentId());
			 		student.setStudentRoom(roomId);
			 		txStudentRepository.save(student);
			 		
			 		return true;
				}
			    break;
			    
		 case 8:

			 	MsBuildingEight msBuildingEight = msBuildingEightRepository.findByRoomId(roomId);
			 	if (msBuildingEight.getNumber()<msBuildingEight.getBuildingTotal()) {
			 		
			 		Integer Availability = msBuildingEight.getNumber()+1;
			 		
			 		TxReserve txReserve = new TxReserve();
			 		txReserve.setBuildingId(buildingId);
			 		txReserve.setBuildingTypeId(msBuildingEight.getTypeId());
			 		txReserve.setRoomId(roomId);
			 		txReserve.setStudentId(reserve.getStudentId());
			 		txReserve.setStudentFname(reserve.getStudentFname());
			 		txReserve.setStudentLname(reserve.getStudentLname());

			 		TxSetDate setDate = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 		txReserve.setSetPaymentDue(setDate.getSetPaymentDue());
			 		txReserve.setSetPaymentstart(setDate.getSetPaymentstart());
			 		txReserve.setYear(setDate.getYear());
			 		
			 		long termId = setDate.getTermId();
			 		
			 		MsFee fee = msFeeRepository.findByTermIdANDTypeId(termId, msBuildingEight.getTypeId());
			 		txReserve.setFeeId(fee.getRecId());
			 		txReserve.setReserveDate(date);
			 		txReserve.setReserveRoomstatus(Availability);
			 		txReserve.setReserveStatus(LookupConstant.RESERVE_STATUS_UNPAID);
			 		txReserveRepository.save(txReserve);
			 		
			 		//saveจำนวนลงที่เดิม
			 		msBuildingEight.setNumber(Availability);
			 		msBuildingEightRepository.save(msBuildingEight);
			 		
			 		TxStudent student = txStudentRepository.findByStudentId(reserve.getStudentId());
			 		student.setStudentRoom(roomId);
			 		txStudentRepository.save(student);
			 		
			 		return true;
				}
			    break;

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
		
		TxSetDate editStatus = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
		if (editStatus!=null) {
			if (editStatus.getTermId()!=date.getTermId()&&editStatus.getYear()!=date.getYear()) {
				editStatus.setSetStatus(LookupConstant.SET_DATE_STATUS_CLOSE);
				txSetDateRepository.save(editStatus);
				
				TxSetDate txSetDate = new TxSetDate();
				txSetDate.setTermId(date.getTermId());
				txSetDate.setSetReserveStart(date.getSetReserveStart());
				txSetDate.setSetReserveDue(date.getSetReserveDue());
				txSetDate.setYear(date.getYear());
				txSetDate.setSetPaymentstart(date.getSetReserveStart());
				txSetDate.setSetPaymentDue(date.getSetReserveDue());
				txSetDate.setSetStatus(LookupConstant.SET_DATE_STATUS_OPEN);
				
				txSetDateRepository.save(txSetDate);
				}
		}else {
			
			TxSetDate txSetDate = new TxSetDate();
			txSetDate.setTermId(date.getTermId());
			txSetDate.setSetReserveStart(date.getSetReserveStart());
			txSetDate.setSetReserveDue(date.getSetReserveDue());
			txSetDate.setYear(date.getYear());
			txSetDate.setSetPaymentstart(date.getSetReserveStart());
			txSetDate.setSetPaymentDue(date.getSetReserveDue());
			txSetDate.setSetStatus(LookupConstant.SET_DATE_STATUS_OPEN);
			
			txSetDateRepository.save(txSetDate);
		}
		
		return true;
			
	}
	
	
	
	//Adminดูข้อมูล
	public Iterable<TxReserve> adminView(String keyword,String status,String status2){
		
		Iterable<TxReserve> view = txReserveRepository.findTxReserveByKeywordDESC(keyword, status, status2);
		
		return view;
	}
	
	//createReceipt
	public TxReserve createReceipt(long reserveId,long officerId) {
		MsRunningNumber description = runningNumberService.getNextNumber("reserve_receipt");
		int number = description.getNumber();
		
		TxReserve txReserve = txReserveRepository.findByRecId(reserveId);

		long millies = System.currentTimeMillis();
		Date date = new Date(millies);

		txReserve.setReceiptDate(date);
		txReserve.setReceiptNumber(number);
		txReserve.setOfficerId(officerId);
		txReserve.setReserveStatus(LookupConstant.RESERVE_STATUS_PAID);
		
		TxSetDate txSetDate = txSetDateRepository.findBySetStatus(LookupConstant.SET_DATE_STATUS_OPEN);
		txReserve.setYear(txSetDate.getYear());
		txReserve.setTermId(txSetDate.getTermId());
		
		txReserveRepository.save(txReserve);
		
		return txReserve;
	}
	
	
	//ดึงข้อมูล
}
