package com.Employee_Api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Employee_Api.Model.Employee;
import com.Employee_Api.Repository.EmployeeDao;

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDao emp;

	public void save(Employee employee) {
		// TODO Auto-generated method stub

	}

	public List<Employee> findAll() {
		List<Employee> employees = this.emp.findAll();
		return employees;
	}

	public List<Employee> findById() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public Response createUser(Dto dto) {
		Response response = null;
		return response;
	}

}
