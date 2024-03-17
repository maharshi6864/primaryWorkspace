package com.crud.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.model.PersonalDetails;

@Repository
public class PersonalDaoImp implements PersonalDao {

	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public void insert(PersonalDetails student) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(student);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}		
		
	@Override
	public List<PersonalDetails> search() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonalDetails> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
