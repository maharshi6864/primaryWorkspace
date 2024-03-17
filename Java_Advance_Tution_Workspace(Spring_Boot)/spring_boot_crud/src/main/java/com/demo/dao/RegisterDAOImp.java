package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.RegisterVo;

@Repository
public class RegisterDAOImp implements RegisterDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insert(RegisterVo registerVo){
		try {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(registerVo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RegisterVo> search() {
		List<RegisterVo> registerList = new ArrayList<RegisterVo>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from RegisterVo");
			registerList = (List<RegisterVo>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RegisterVo> findById(int id) {
		List<RegisterVo> registerList = new ArrayList<RegisterVo>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from RegisterVo where id = " + id);
			registerList = (List<RegisterVo>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}
}
