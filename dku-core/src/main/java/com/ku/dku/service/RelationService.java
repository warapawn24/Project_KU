package com.ku.dku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ku.dku.entity.MsPublicRelation;
import com.ku.dku.repository.MsPublicRelationRepository;

@Service
public class RelationService {

	@Autowired private MsPublicRelationRepository msPublicRelationRepository;
	@Autowired private FileService fileService;
	
	public MsPublicRelation updateData(MsPublicRelation relation) {
		
		MsPublicRelation publicRelation = new MsPublicRelation();
		publicRelation.setRelationName(relation.getRelationName());
		publicRelation.setDescription(relation.getDescription());
		publicRelation.setFileId(relation.getFileId());
		
		msPublicRelationRepository.save(publicRelation);
		
		return relation;
		
	}
}
