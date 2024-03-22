package com.society.repository;

import java.util.List;

import com.society.models.LoginVo;

public interface LoginDAO {

	void insertLogin(LoginVo loginVO);

	List<LoginVo> findById(int id);

	LoginVo getCurrentUserByUserName(String userName);

}
