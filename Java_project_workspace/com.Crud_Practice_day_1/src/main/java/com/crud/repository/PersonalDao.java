package com.crud.repository;

import java.util.List;

import com.crud.model.PersonalDetails;

public interface PersonalDao {
	public void insert(PersonalDetails student);
	
	public List<PersonalDetails> search();
	
	public List<PersonalDetails> findById(int id);
	
	public void delete(int id);
}
