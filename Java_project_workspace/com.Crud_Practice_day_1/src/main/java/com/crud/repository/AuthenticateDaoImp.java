package com.crud.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.model.Authentication;

@Repository
public class AuthenticateDaoImp implements AuthenticateDao{

	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public void insert(Authentication student) {
		try {
			System.out.println("Insering authentivcatio");
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(student);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public List<Authentication> search() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Authentication> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
