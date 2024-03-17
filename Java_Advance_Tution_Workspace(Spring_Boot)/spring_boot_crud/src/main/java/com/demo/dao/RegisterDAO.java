package com.demo.dao;

import java.util.List;

import com.demo.model.RegisterVo;

public interface RegisterDAO {
	void insert(RegisterVo registerVo);
	
	List<RegisterVo> search();
	
	List<RegisterVo> findById(int id);
	
}
