package com.crud.userDao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.userVo.UserVo;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	public SessionFactory sessionFactory;

	@Override
	public void insert(UserVo uservo) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(uservo);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserVo> search() {
		List<UserVo> userList = new ArrayList<UserVo>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from UserVo");
			userList = (List<UserVo>) query.list();
		} catch (Exception e) {
			System.out.println(e);
		}
		return userList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserVo> findById(int id) {
		List<UserVo> userList = new ArrayList<UserVo>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from UserVo  where id = " + id);
			userList = query.list();
		} catch (Exception e) {
			System.out.println(e);
		}
		return userList;
	}

	@Override
	public void deleteUser(UserVo deleteObj) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.delete(deleteObj);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
