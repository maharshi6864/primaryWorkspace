package com.crud.repository;

import java.util.List;

import com.crud.model.Student;

public interface StudentDao {

	public void insert(Student student);
	
	public List<Student> search();
	
	public List<Student> findById(int id);
	
	public void delete(int id);
}
