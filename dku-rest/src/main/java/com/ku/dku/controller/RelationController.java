package com.ku.dku.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ku.dku.bean.AdminUpdateRelationResponse;
import com.ku.dku.bean.FileStatusResponse;
import com.ku.dku.bean.ListRelationViewResponse;
import com.ku.dku.bean.RelationViewResponse;
import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.MsFile;
import com.ku.dku.entity.MsFileOther;
import com.ku.dku.entity.MsPublicRelation;
import com.ku.dku.repository.MsFileOtherRepository;
import com.ku.dku.repository.MsPublicRelationRepository;
import com.ku.dku.service.FileService;
import com.ku.dku.service.RelationService;

@RestController
@RequestMapping(value = "/publicRelation")
public class RelationController {

	@Autowired private RelationService relationService;
	@Autowired private FileService fileService;
	@Autowired private MsFileOtherRepository msFileOtherRepository;
	@Autowired private MsPublicRelationRepository msPublicRelationRepository;
	
	//แอดมินเพิ่มข่าว
	@RequestMapping(value = "/updateData",method = RequestMethod.POST)
	public @ResponseBody AdminUpdateRelationResponse update(@RequestParam("relationName")String relationName ,@RequestParam("description")String description ,@RequestParam("file") MultipartFile file) throws IOException {
		AdminUpdateRelationResponse response = new AdminUpdateRelationResponse();
		
		String message = "";

//		try {
		MsFileOther fileOther = fileService.storeOther(file);
				if (fileOther!=null) {
					
					message = "Uploaded the file successfully: " + file.getOriginalFilename();												
					MsPublicRelation relation = new MsPublicRelation();
					relation.setRelationName(relationName);
					relation.setDescription(description);
					relation.setFileId(fileOther.getRecId());
					
					MsPublicRelation update = relationService.updateData(relation);
					if (update!=null) {
//						response.setRelationId(update.getRecId());
//						response.setRelationName(update.getRelationName());
//						response.setDescription(update.getDescription());
//						response.setFileName(fileOther.getFileName());
						response.setStatusResponse(message);
					}else {
						
						response.setStatusResponse(LookupConstant.RESPONSE_STATUS_FAILED);
					}
//		}
//		} catch (Exception e) {
//			message = "Could not upload the file: ";
//			response.setStatusResponse(message);
//		}
	
				}else {
					response.setStatusResponse(LookupConstant.RESPONSE_STATUS_FAILED);
				}
				return response;
		
	}
	
	
	@GetMapping("/getFile")
	public ResponseEntity<byte[]> getFile(@RequestParam("fileId") long fileId) {
		MsFileOther file = fileService.getFileOther(fileId);

		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFileName() + "\"")
				.body(file.getFileData());
	}
	
	
	@GetMapping(value = "/view")
	public @ResponseBody ListRelationViewResponse view() {
		ListRelationViewResponse response = new ListRelationViewResponse();
		
		List<RelationViewResponse> detail = new ArrayList<RelationViewResponse>();
		
		Iterable<MsPublicRelation> listRelation = msPublicRelationRepository.findAll();
		for (MsPublicRelation msPublicRelation : listRelation) {
			RelationViewResponse data = new RelationViewResponse();
			data.setDescription(msPublicRelation.getDescription());
			data.setRelationName(msPublicRelation.getRelationName());
			data.setRelationId(msPublicRelation.getRecId());
			data.setFileId(msPublicRelation.getFileId());;
			
//			MsFileOther file = fileService.getFileOther(msPublicRelation.getFileId());
//			ResponseEntity.ok()
//			.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFileName() + "\"")
//			.body(file.getFileData());
					
			detail.add(data);
			response.setDetail(detail);	
		}
		
		
		return response;
		
	}
	
	
}
