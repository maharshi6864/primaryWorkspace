package com.demo.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

import org.hibernate.*;
import org.hibernate.annotations.FetchProfile.FetchOverride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.Vo.RegisterVo;

@Repository
public class RegisterDaoImp implements RegisterDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insert(RegisterVo registerVo) {
		try {
			org.hibernate.Session session =sessionFactory.getCurrentSession();
			session.saveOrUpdate(registerVo);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public List<RegisterVo> search() {
		List <RegisterVo> searchList= new ArrayList<RegisterVo>();
		try {
			org.hibernate.Session session =sessionFactory.getCurrentSession();
			Query query=session.createQuery("from RegisterVo where status is true");
			searchList=(List<RegisterVo>) query.list();
		} catch (Exception e) {
			System.out.println(e);
		}
		return searchList;
	}

	@Override
	public List<RegisterVo> findById(int id) {
		List<RegisterVo> editList=new ArrayList<RegisterVo>();
		try {
			org.hibernate.Session session =sessionFactory.getCurrentSession();
			Query query=session.createQuery("from RegisterVo where id= "+id);
			editList=(List<RegisterVo>) query.list();
		} catch (Exception e) {
			System.out.println(e);
		}
		return editList;
	}
	
}
