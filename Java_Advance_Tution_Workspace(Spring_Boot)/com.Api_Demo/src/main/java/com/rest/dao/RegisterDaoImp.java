package com.rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest.model.LoginVo;
import com.rest.model.RegisterVo;

@Repository
public class RegisterDaoImp implements RegisterDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<RegisterVo> getAll()
	{
		List<RegisterVo> getList=new ArrayList<RegisterVo>(); 
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from RegisterVo where status = true");
			getList=query.list();	
		} catch (Exception e) {
			System.out.println(e);
		}
		return getList;
		
	}


	@Override
	public void insertRegister(RegisterVo registerVo) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(registerVo);
		} catch (Exception e) {
			System.out.println(e);
		}		
	}


	@Override
	public void insertLogin(LoginVo loginVo) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(loginVo);
		} catch (Exception e) {
			System.out.println(e);
		}		
	}


	@Override
	public List<RegisterVo> findById(int id) {
		List<RegisterVo> editList=new ArrayList<RegisterVo>(); 
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query = session.createQuery("from RegisterVo where id = " + id);
			editList=query.list();	
		} catch (Exception e) {
			System.out.println(e);
		}
		return editList;
	}
}
