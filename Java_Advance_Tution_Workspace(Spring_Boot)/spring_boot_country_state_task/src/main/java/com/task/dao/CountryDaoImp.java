package com.task.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.task.vo.CountryVo;

@Repository
public class CountryDaoImp implements CountryDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void insertCountry(CountryVo countryVo) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(countryVo);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public List<CountryVo> searchCountry() {
		List<CountryVo> searchCountryList=new ArrayList<CountryVo>();
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from CountryVo");
			searchCountryList=query.list();
		} catch (Exception e) {
			System.out.println(e);
		}
		return searchCountryList;
	}

	public List<CountryVo> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
