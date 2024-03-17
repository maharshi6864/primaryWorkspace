package com.task.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.task.vo.StateVo;


@Repository
public class StateDaoImp implements StateDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void insertState(StateVo stateVo) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(stateVo);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public List<StateVo> searchState() {
		List<StateVo> searchStateList= new  ArrayList<StateVo>();
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from StateVo");
			searchStateList=query.list();
		} catch (Exception e) {
			System.out.println(e);
		}
		return searchStateList;
	}

	public List<StateVo> findById(int id) {
		List<StateVo> searchStateList= new  ArrayList<StateVo>();
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from StateVo where id="+id);
			searchStateList=query.list();
		} catch (Exception e) {
			System.out.println(e);
		}
		return searchStateList;
	}

}
