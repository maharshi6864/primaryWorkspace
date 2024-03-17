package com.crud.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.model.Student;

@Repository
public class StudentDaoImp implements StudentDao {

	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public void insert(Student student) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(student);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> search() {
		List<Student> studentList=new ArrayList<Student>();
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from Student ");
			studentList=query.list();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return studentList;
	}

	@Override
	public List<Student> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
