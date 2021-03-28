package com.ku.dku.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.CheckPostRequest;
import com.ku.dku.bean.CheckPostResponse;
import com.ku.dku.bean.ListCheckPostDataResponse;
import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.TxPost;
import com.ku.dku.repository.TxPostRepository;
import com.ku.dku.service.PostService;

@RestController
@RequestMapping(value = "/user/post")
public class PostController {

	@Autowired private PostService postService;
	@Autowired private TxPostRepository txPostRepository;
	
	//ตรวจพัสดุ
	@RequestMapping(value = "/checkPost",method = RequestMethod.POST)
	public @ResponseBody CheckPostResponse checkPost(@RequestBody CheckPostRequest request) throws Exception {
	
		CheckPostResponse response = new CheckPostResponse();
		
		
		List<ListCheckPostDataResponse> postDetail = new ArrayList<ListCheckPostDataResponse>();
		
		Iterable<TxPost> listTxPost = txPostRepository.findByStudentIdOrderByRecIdDESC(request.getStudentId());
		
		for (TxPost txPost : listTxPost) {
			ListCheckPostDataResponse postData = new ListCheckPostDataResponse();
			if (txPost.getPostStatus().equals(LookupConstant.POST_STATUS_RECEIVED)) {
				
				
				postData.setPostId(txPost.getRecId());
				postData.setPostCode(txPost.getPostCode());
				postData.setPostDate(txPost.getPostDate());
				postData.setPostRecivedate(txPost.getPostRecivedate());
				postData.setPostStatus(txPost.getPostStatus());
			}
			else {
				postData.setPostId(txPost.getRecId());
				postData.setPostCode(txPost.getPostCode());
				postData.setPostDate(txPost.getPostDate());
				postData.setPostRecivedate(null);
				postData.setPostStatus(txPost.getPostStatus());
			}
			
			postDetail.add(postData);
			response.setPostDetail(postDetail);
		}
		
		
		return response;
		
	}
}
