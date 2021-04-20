package com.ku.dku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ku.dku.entity.TxPost;
import com.ku.dku.repository.TxPostRepository;

@Service
public class PostService {
	
	@Autowired private TxPostRepository txPostRepository;
	
	public Iterable<TxPost> checkPost(long studentId) {
		
		Iterable<TxPost> post = txPostRepository.findByStudentIdOrderByRecIdDESC(studentId);
		
		return post;
		
	}
}
