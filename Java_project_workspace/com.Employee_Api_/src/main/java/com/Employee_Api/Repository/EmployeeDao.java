package com.Employee_Api.Repository;

import java.util.List;

import com.Employee_Api.Model.Employee;

public interface EmployeeDao {
	
	void save(Employee employee);
	
	List<Employee> findAll();
	
	List<Employee> findById();
	
	void delete();

}
