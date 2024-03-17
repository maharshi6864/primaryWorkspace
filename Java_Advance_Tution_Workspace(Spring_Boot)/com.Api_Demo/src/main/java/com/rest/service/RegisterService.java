package com.rest.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.rest.dto.Dto;
import com.rest.model.RegisterVo;

public interface RegisterService {

	List<RegisterVo> getAll();
	
	ResponseEntity<Response> createUser(Dto dto);

	ResponseEntity<Response> editUser(Dto dto);
	
	ResponseEntity<Response> search();
	
	ResponseEntity<Response> edit(int id);
	
	ResponseEntity<Response> delete(int id);

	ResponseEntity<Response> update(Dto dto);

}
