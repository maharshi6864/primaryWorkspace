package com.Employee_Api.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee_Api.Model.Employee;
import com.Employee_Api.Service.Dto;
import com.Employee_Api.Service.EmployeeService;
import com.Employee_Api.Service.Response;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/")
public class EmployeeController {

	@Autowired
	private EmployeeService emp;

	@GetMapping(value = "/getemployee")
	public ResponseEntity<List<Employee>> getAll() {
		List<Employee> employees = this.emp.findAll();
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}

	@PostMapping(value = "/createuser")
	public ResponseEntity<Response> createUser(@RequestBody Dto dto) {
		Response response=this.emp.createUser(dto);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
			
	}
}
