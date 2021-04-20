package com.ku.dku.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.AdminSearchPostRequest;
import com.ku.dku.bean.AdminSearchPostResponse;
import com.ku.dku.bean.AdminUpdatePostRequest;
import com.ku.dku.bean.AdminUpdatePostResponse;
import com.ku.dku.bean.ChangeStatusPostRequest;
import com.ku.dku.bean.ChangeStatusPostResponse;
import com.ku.dku.bean.CheckPostRequest;
import com.ku.dku.bean.CheckPostResponse;
import com.ku.dku.bean.ListAdminSearchPostResponse;
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
	
	
	//AdminUpdatePost
	@RequestMapping(value = "/adminUpdate",method = RequestMethod.POST)
	public @ResponseBody AdminUpdatePostResponse update(@RequestBody AdminUpdatePostRequest request) {
		AdminUpdatePostResponse response = new AdminUpdatePostResponse();
		
		TxPost update = postService.updatePost(request.getStudentId());
		if (update!=null) {
			response.setPostId(update.getRecId());
			response.setStatusResponse(LookupConstant.RESPONSE_STATUS_SUCCESS);
		}else {
			response.setStatusResponse(LookupConstant.RESPONSE_STATUS_FAILED);
		}
		return response;
		
	}
	
	//AdminSearch
	@RequestMapping(value = "/adminSearch",method = RequestMethod.POST)
	public @ResponseBody AdminSearchPostResponse search(@RequestBody AdminSearchPostRequest request) {
		
		AdminSearchPostResponse response = new AdminSearchPostResponse();
		
		TxPost post = postService.search(request.getKeyword(), LookupConstant.POST_STATUS_NOTRECEIVE, LookupConstant.POST_STATUS_RECEIVED);
		response.setPostId(post.getRecId());
		response.setPostStatus(post.getPostStatus());
		response.setStudentFname(post.getStudentFname());
		response.setStudentId(post.getStudentId());
		response.setStudentLname(post.getStudentLname());
		
		return response;
	}
	
	//adminview
	@GetMapping(value = "/viewPost")
	public @ResponseBody ListAdminSearchPostResponse view() {
		ListAdminSearchPostResponse response = new ListAdminSearchPostResponse();
		
		List<AdminSearchPostResponse> detail = new ArrayList<AdminSearchPostResponse>();
		Iterable<TxPost> listPost = txPostRepository.findAll();
		for (TxPost post : listPost) {
			AdminSearchPostResponse data = new AdminSearchPostResponse();
			data.setPostId(post.getRecId());
			data.setPostStatus(post.getPostStatus());
			data.setStudentFname(post.getStudentFname());
			data.setStudentId(post.getStudentId());
			data.setStudentLname(post.getStudentLname());
			
			detail.add(data);
			response.setDetail(detail);
			
		}
		return response;
	}
	
	//change
	@RequestMapping(value = "/changeStatus",method = RequestMethod.POST)
	public @ResponseBody ChangeStatusPostResponse change(@RequestBody ChangeStatusPostRequest request) {
		
		ChangeStatusPostResponse response = new ChangeStatusPostResponse();
		
		boolean change = postService.changeStatus(request.getPostId());
		if (change) {
			response.setStatusResponse(LookupConstant.RESPONSE_STATUS_SUCCESS);
		}else {
			response.setStatusResponse(LookupConstant.RESPONSE_STATUS_FAILED);
		}
		return response;
	}
}
