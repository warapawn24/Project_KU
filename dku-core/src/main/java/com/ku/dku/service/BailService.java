package com.ku.dku.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ku.dku.bean.ListBailEquipmentRequest;
import com.ku.dku.bean.ListBailTypeRequest;
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
	
	public boolean createBail(long termId,int year,long studentId) {
		
		long millies = System.currentTimeMillis();
		Date date = new Date(millies);
		
		LkTerm term = lkTermRepository.findByTermId(termId);
		
		TxStudent student = txStudentRepository.findByStudentId(studentId);
		
		//create
		TxBail bail = new TxBail();
		bail.setBailDate(date);
		bail.setTermName(term.getTermName());
		bail.setYear(year);
		bail.setStudentId(studentId);
		bail.setStudentFname(student.getStudentFname());
		bail.setStudentLname(student.getStudentLname());
		bail.setRoomId(student.getStudentRoom());
		txBailRepository.save(bail);
		
	
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
		addData.setBailStatus("waitting");
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
	
}
