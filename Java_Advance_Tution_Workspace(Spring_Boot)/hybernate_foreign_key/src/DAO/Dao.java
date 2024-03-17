package DAO;

import VO.LoginVo;
import VO.RegisterVo;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

public class Dao {
	public void register(LoginVo l){
		SessionFactory sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(l);
		
		
		transaction.commit();
		session.close();
	}
	public void register1(RegisterVo r){
		SessionFactory sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(r);
		
		
		transaction.commit();
		session.close();
	}
	public List search(){
		
		List searchList = new ArrayList<>();
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query q = session.createQuery("from RegisterVo");
		
		searchList = q.list();
		
		transaction.commit();
		session.close();
		
		return searchList;
	}
	public void delete(RegisterVo v,LoginVo l)
	{
		SessionFactory sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.delete(v);
		session.delete(l);
		
		transaction.commit();
		session.close();
	}
	public List edit(RegisterVo v){
		
		List searchList = new ArrayList<>();
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query q = session.createQuery("from RegisterVo where id = "+v.getId()+" ");
		
		searchList = q.list();
		
		transaction.commit();
		session.close();
		
		return searchList;
	}
	public void update(RegisterVo v)
	{
		SessionFactory sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		session.update(v);
		
		transaction.commit();
		session.close();
	}
	public void updateLogin(LoginVo l)
	{
		SessionFactory sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		session.update(l);
		
		transaction.commit();
		session.close();
	}
}

