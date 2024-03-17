package com.Employee_Api.Service;

import java.util.List;
import com.Employee_Api.Model.Employee;

public interface EmployeeService {

	void save(Employee employee);

	List<Employee> findAll();

	List<Employee> findById();

	void delete();

	Response createUser(Dto dto);

}
