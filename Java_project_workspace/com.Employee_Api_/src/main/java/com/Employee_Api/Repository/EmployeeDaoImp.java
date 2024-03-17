package com.Employee_Api.Repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Employee_Api.Model.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void save(Employee employee) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(employee);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@SuppressWarnings("unchecked")
	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<Employee>();
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from Employee where status = true");
			employees=query.list();
		} catch (Exception e) {
			System.out.println(e);
		}
		return employees;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> findById() {
		List<Employee> employees = new ArrayList<Employee>();
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from Employees where status = true");
			employees=query.list();
		} catch (Exception e) {
			System.out.println(e);
		}
		return employees;
	}

	public void delete() {
		// TODO Auto-generated method stub

	}

}
