package com.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.dto.Dto;
import com.rest.model.RegisterVo;
import com.rest.service.RegisterService;
import com.rest.service.Response;

@CrossOrigin(origins = "*")
@RestController
public class ApiController {

	@Autowired
	private RegisterService registerService;

	@GetMapping(value = "/user")
	public ResponseEntity<List<RegisterVo>> get() {
		List<RegisterVo> searchList = this.registerService.getAll();
		System.out.println("searchList ::::::::::::::::: "+searchList.size());
		return new ResponseEntity<List<RegisterVo>>(searchList, HttpStatus.OK);
	}

	@PostMapping(value = "/user")
	public ResponseEntity createUser(@RequestBody Dto dto) {
		ResponseEntity<Response> response=this.registerService.createUser(dto);
		System.out.println("adding user");
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	@PostMapping(value = "/edit")
	public ResponseEntity editUser(@RequestBody Dto dto) {
		ResponseEntity<Response> response=this.registerService.editUser(dto);
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value="/search")
	public ResponseEntity search()
	{
		ResponseEntity<Response> response =this.registerService.search();
		System.out.println(response);
		return new ResponseEntity(response,HttpStatus.OK);
	}
	
	@GetMapping(value="/edit/{id}")
	public ResponseEntity edit(@PathVariable int id)
	{
		ResponseEntity<Response> response=this.registerService.edit(id);
		return new ResponseEntity(response,HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@PutMapping(value="/update")
	public ResponseEntity update(@RequestBody Dto dto)
	{	
		System.out.println(dto);
		ResponseEntity<Response> reponse=this.registerService.update(dto);
		return new ResponseEntity(reponse,HttpStatus.OK);
	}
	
	@CrossOrigin(origins ="http://localhost:8080" )
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity delete(@PathVariable int id)
	{
		ResponseEntity<Response> response=this.registerService.delete(id);
		return new ResponseEntity(response,HttpStatus.OK);
	}
}
