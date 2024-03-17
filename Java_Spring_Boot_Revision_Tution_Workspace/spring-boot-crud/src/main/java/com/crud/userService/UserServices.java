package com.crud.userService;

import java.util.List;
import com.crud.userVo.UserVo;

public interface UserServices {

	public List<UserVo> searchUser();
	
	public void insertUser(UserVo userVo);
	
	public List<UserVo> findById(int id);
	
	public void deleteUser(int id);
	
}
