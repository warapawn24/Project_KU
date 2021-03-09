package com.ku.dku.service;

import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.util.StringUtils;

import com.ku.dku.entity.MsFile;
import com.ku.dku.repository.MsFileRepository;

@MultipartConfig(

		maxFileSize = -1L, maxRequestSize = -1L)

@Service
public class FileService {

	@Autowired
	private MsFileRepository msFileRepository;

	public MsFile store(MultipartFile file, long txStudentId) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		MsFile files = new MsFile(fileName, file.getContentType(), file.getBytes(), txStudentId);

		return msFileRepository.save(files);
	}

	public MsFile getFile(long txStudentId) {
		return msFileRepository.findByTxStudentId(txStudentId);
	}

	public Stream<MsFile> getAllFiles() {
		return msFileRepository.findAll().stream();
	}
}
