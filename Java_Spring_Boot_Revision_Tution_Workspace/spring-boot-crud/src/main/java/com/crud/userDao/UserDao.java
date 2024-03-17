package com.crud.userDao;

import java.util.List;

import com.crud.userVo.UserVo;

public interface UserDao {

	public void insert(UserVo uservo);
	
	public List<UserVo> search();
	
	public List<UserVo> findById(int id);
	
	public void deleteUser(UserVo deleteObj);
	
}
