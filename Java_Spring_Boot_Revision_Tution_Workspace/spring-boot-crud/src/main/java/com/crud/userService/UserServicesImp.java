package com.crud.userService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.userDao.UserDao;
import com.crud.userVo.UserVo;

@Service
@Transactional
public class UserServicesImp implements UserServices {

	@Autowired
	public UserDao userDao;

	@Override
	public List<UserVo> searchUser() {
		List<UserVo> userList = this.userDao.search();
		return userList;
	}

	@Override
	public void insertUser(UserVo userVo) {
		this.userDao.insert(userVo);
	}

	@Override
	public List<UserVo> findById(int id) {
		List<UserVo> userList =this.userDao.findById(id);
		return userList;
	}

	@Override
	public void deleteUser(int id) {
		List<UserVo> userList =this.userDao.findById(id);
		this.userDao.deleteUser(userList.get(0));
		
	}

}
