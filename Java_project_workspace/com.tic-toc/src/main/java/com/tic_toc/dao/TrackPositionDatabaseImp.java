package com.tic_toc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.tic_toc.model.Tracker;

public class TrackPositionDatabaseImp implements TrackPositionDatabase {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Tracker> getPostion(int id) {
			try {
				Session session = sessionFactory.getCurrentSession();
				Query query=session.createQuery("from Employee where id = "+id);
//				List<tracker> lastPostion=

			} catch (Exception e) {
				System.out.println(e);
			}
			return null;

		}
	

	@Override
	public List<Tracker> setPostion() {
		// TODO Auto-generated method stub
		return null;
	}

}
