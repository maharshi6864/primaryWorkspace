package com.crud.repository;

import java.util.List;

import com.crud.model.Authentication;

public interface AuthenticateDao {
	public void insert(Authentication student);
	
	public List<Authentication> search();
	
	public List<Authentication> findById(int id);
	
	public void delete(int id);
}
