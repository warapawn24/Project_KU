package com.ku.dku.service;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.TxPost;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.TxPostRepository;
import com.ku.dku.repository.TxStudentRepository;

@Service
public class PostService {
	
	@Autowired private TxPostRepository txPostRepository;
	@Autowired private TxStudentRepository txStudentRepository;
	
	public Iterable<TxPost> checkPost(long studentId) {
		
		Iterable<TxPost> post = txPostRepository.findByStudentIdOrderByRecIdDESC(studentId);
		
		return post;
		
	}
	
	//แอดมินเพิ่มพัสดุ
	public TxPost updatePost(long studentId) {
		
		int curyear = Calendar.getInstance(new Locale("en", "EN")).get(Calendar.YEAR);
		curyear += 543;
		
		long millies = System.currentTimeMillis();
		Date date = new Date(millies);
		
		TxPost post = new TxPost();
		post.setStudentId(studentId);
		post.setPostDate(date);
		
		TxStudent student = txStudentRepository.findByStudentId(studentId);
		post.setStudentFname(student.getStudentFname());
		post.setStudentLname(student.getStudentLname());
		post.setPostStatus(LookupConstant.POST_STATUS_NOTRECEIVE);
		
//		long recId = post.getRecId();
//		String postCode=String.valueOf(recId);
//		
//		post.setPostCode(postCode);
		post.setYear(curyear);
		post.setPostRecivedate(null);
		
		txPostRepository.save(post);
		
		return post;
		
	}
	
	//ค้นหาKeyword
	public TxPost search(String keyword,String status,String status2){
		TxPost post = txPostRepository.findTxPostByKeywordDESC(keyword, status, status2);
		
		return post;
	}
	
	public boolean changeStatus(long postId) {
		
		long millies = System.currentTimeMillis();
		Date date = new Date(millies);
		
		TxPost post = txPostRepository.findByRecId(postId);
		post.setPostStatus(LookupConstant.POST_STATUS_RECEIVED);
		post.setPostRecivedate(date);
		txPostRepository.save(post);
		
		return true;
	}
}
