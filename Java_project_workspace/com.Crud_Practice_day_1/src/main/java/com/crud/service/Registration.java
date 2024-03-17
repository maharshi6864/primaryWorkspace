package com.crud.service;

import java.util.List;

public interface Registration {
	
	public void insert(Dto dto);
	
	public List<Dto> search();
	
	
	public void delete(Dto dto);
	
	public List<Dto> findById();
	
}
