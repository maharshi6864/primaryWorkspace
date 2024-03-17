package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import vo.*;

public class Dao {
	public void insertCountry(CountryVo c) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(c);

		transaction.commit();
		session.close();
	}

	public void insertState(StateVo s) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(s);

		transaction.commit();
		session.close();
	}

	public List searchCountry() {

		List searchList = new ArrayList<>();

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Query q = session.createQuery("from CountryVo  ");

		searchList = q.list();

		transaction.commit();
		session.close();

		return searchList;
	}

	public List searchState() {

		List searchList = new ArrayList<>();

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Query q = session.createQuery("from StateVo");

		searchList = q.list();

		transaction.commit();
		session.close();

		return searchList;
	}

	public List findState(StateVo v) {
		List searchList = new ArrayList<>();

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Query q = session.createQuery("from StateVo where id = " + v.getId() + " ");

		searchList = q.list();

		transaction.commit();
		session.close();
		return searchList;
	}

	public void updateState(StateVo s) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.update(s);

		transaction.commit();
		session.close();
	}

}
