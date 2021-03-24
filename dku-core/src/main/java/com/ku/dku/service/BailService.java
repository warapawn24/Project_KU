package com.ku.dku.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ku.dku.bean.ListBailEquipmentRequest;
import com.ku.dku.bean.ListBailTypeRequest;
import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.LkTerm;
import com.ku.dku.entity.TxBail;
import com.ku.dku.entity.TxBailEquipment;
import com.ku.dku.entity.TxBailType;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.LkTermRepository;
import com.ku.dku.repository.TXBailEquipmentRepository;
import com.ku.dku.repository.TxBailRepository;
import com.ku.dku.repository.TxBailTypeRepository;
import com.ku.dku.repository.TxStudentRepository;

@Service
public class BailService {

	@Autowired private TxBailRepository txBailRepository;
	@Autowired private LkTermRepository lkTermRepository;
	@Autowired private TxStudentRepository txStudentRepository;
	@Autowired private TxBailTypeRepository txBailTypeRepository;
	@Autowired private TXBailEquipmentRepository txBailEquipmentRepository;
	
	
	public Iterable<LkTerm> getListTerm(){
		
		Iterable<LkTerm> listTerm = lkTermRepository.findAll();
		
		return listTerm;
		
	}
	
	public boolean createBail(long studentId) {
		
		long millies = System.currentTimeMillis();
		Date date = new Date(millies);
		
		TxBail bail = new TxBail();
			
		TxBail txBail = txBailRepository.findByStudentId(studentId);
		
		if (txBail == null) {
			
		
		TxStudent student = txStudentRepository.findByStudentId(studentId);
		//create
		bail.setBailDate(date);
		bail.setStudentId(studentId);
		bail.setStudentFname(student.getStudentFname());
		bail.setStudentLname(student.getStudentLname());
		bail.setRoomId(student.getStudentRoom());
		bail.setBailStatus(LookupConstant.BAIL_STATUS_ALREADYDONE);
		txBailRepository.save(bail);
		
		}else {
			bail.setBailStatus(LookupConstant.BAIL_STATUS_ALREADYDONE);
		}
		
		
	
		return true;
		
	}
	
	public boolean updateBailData(TxBail bail,List<ListBailTypeRequest> bailTypeRequest,List<ListBailEquipmentRequest> bailEquipmentRequest) {
	
		TxBail addData = txBailRepository.findByRecId(bail.getRecId());
		
		addData.setBailPhone(bail.getBailPhone());
//		addData.setBailType(bail.getBailType());
		addData.setBaillNote(bail.getBaillNote());
//		addData.setBailEquipment(bail.getBailEquipment());
		addData.setBailAccouctnum(bail.getBailAccouctnum());
		addData.setBailBank(bail.getBailBank());
		addData.setTermName(bail.getTermName());
		addData.setYear(bail.getYear());
		addData.setBailStatus(LookupConstant.BAIL_STATUS_WAITING);
		txBailRepository.save(addData);
		
		//AddDetail
		List<ListBailTypeRequest> listTxBailType = bailTypeRequest;
		for (int i = 0; i < listTxBailType.size(); i++) {
			ListBailTypeRequest bailType = listTxBailType.get(i);
			
			TxBailType txBailType = new TxBailType();
			txBailType.setBailId(bail.getRecId());
			txBailType.setBailType(bailType.getBailType());
			txBailTypeRepository.save(txBailType);
		}
		
		
		List<ListBailEquipmentRequest> listTxBailEquipment = bailEquipmentRequest;
		for (int i = 0; i < listTxBailEquipment.size(); i++) {
			ListBailEquipmentRequest equipment = listTxBailEquipment.get(i);
			
			TxBailEquipment txBailEquipment = new TxBailEquipment();
			txBailEquipment.setBailId(bail.getRecId());
			txBailEquipment.setBailEquipment(equipment.getBailEquipment());
			txBailEquipmentRepository.save(txBailEquipment);
		}
		
		
		return true;
		
	}
	
	public boolean detailBail(long studentId) {
		
		TxBail txBail = txBailRepository.findByStudentId(studentId);
		
		if (txBail.getBailStatus().equals(LookupConstant.BAIL_STATUS_WAITING)) {
			
		}
		
		return false;
		
	}
}
