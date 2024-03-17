package com.rest.dao;

import java.util.List;

import com.rest.model.LoginVo;
import com.rest.model.RegisterVo;

public interface RegisterDao {
	List<RegisterVo> getAll();
	
	void insertRegister(RegisterVo registerVo);
	
	void insertLogin(LoginVo loginVo);
	
	List<RegisterVo> findById(int id);
}
