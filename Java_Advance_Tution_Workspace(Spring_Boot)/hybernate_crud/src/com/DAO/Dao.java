package com.DAO;

import com.VO.Vo;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

public class Dao {
	public void register(Vo v){
		SessionFactory sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(v);
		
		transaction.commit();
		session.close();
	}
	public List search(){
		
		List searchList = new ArrayList<>();
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query q = session.createQuery("from Vo  ");
		
		searchList = q.list();
		
		transaction.commit();
		session.close();
		
		return searchList;
	}
	public void delete(Vo v)
	{
		SessionFactory sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.delete(v);
		
		transaction.commit();
		session.close();
	}
	public List edit(Vo v){
		
		List searchList = new ArrayList<>();
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query q = session.createQuery("from Vo where id = "+v.getId()+" ");
		
		searchList = q.list();
		
		transaction.commit();
		session.close();
		
		return searchList;
	}
	public void update(Vo v)
	{
		SessionFactory sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.update(v);
		
		transaction.commit();
		session.close();
	}
}

