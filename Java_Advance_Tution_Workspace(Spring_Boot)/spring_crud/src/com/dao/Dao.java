package com.dao;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.LoginVo;
import com.vo.RegisterVo;

@Repository
public class Dao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void insert(RegisterVo regVo){
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(regVo);
			transaction.commit();
			session.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public void insertLogin(LoginVo regVo){
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(regVo);
			transaction.commit();
			session.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public List search(){
		List searchList = new ArrayList<>();
		try {
			
			
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			Query q = session.createQuery("from  RegisterVo ");
			
			searchList = q.list();
			
			transaction.commit();
			session.close();
			
			

		} catch (Exception e) {

			e.printStackTrace();
		}
		return searchList;
	}
	public void delete(RegisterVo v)
	{
		try {
			
			
	Session session = sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	session.delete(v);
	
	transaction.commit();
	session.close();
			
			

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	}
	
	public void deleteLogin(LoginVo v)
	{
		try {
			
			
	Session session = sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	session.delete(v);
	
	transaction.commit();
	session.close();
			
			

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	}
	public List edit(int id){
		
		List searchList = new ArrayList<>();
		
		Session session = sessionFactory.openSession();
		
		Query q = session.createQuery("from RegisterVo where id = "+id+" ");
		
		searchList = q.list();
		
		session.close();
		
		return searchList;
	}
//	public void update(Vo v)
//	{
//		SessionFactory sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction transaction=session.beginTransaction();
//		
//		session.update(v);
//		
//		transaction.commit();
//		session.close();
//	}
	
}
