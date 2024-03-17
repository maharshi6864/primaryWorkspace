package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.CountryVo;
import com.vo.StateVo;



@Repository
public class Dao  {

	@Autowired
	SessionFactory sessionFactory;
	
	public void insertCountry(CountryVo countryVo){
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(countryVo);
			transaction.commit();
			session.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public void insertState(StateVo stateVo){
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(stateVo);
			transaction.commit();
			session.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public List searchCountry(){
		List searchList = new ArrayList<>();
		try {
			
			
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			Query q = session.createQuery("from  CountryVo ");
			
			searchList = q.list();
			
			transaction.commit();
			session.close();
			
			

		} catch (Exception e) {

			e.printStackTrace();
		}
		return searchList;
	}
	public List searchState(){
		List searchList = new ArrayList<>();
		try {
			
			
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			Query q = session.createQuery("from  StateVo ");
			
			searchList = q.list();
			
			transaction.commit();
			session.close();
			
			

		} catch (Exception e) {

			e.printStackTrace();
		}
		return searchList;
	}
public List edit(int id){
		
		List searchList = new ArrayList<>();
		
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Query q = session.createQuery("from StateVo where id = "+id+" ");
			
			searchList = q.list();
			
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return searchList;
	}
}
