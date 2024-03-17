package com.demo.Dao;

import java.util.List;

import com.demo.Vo.RegisterVo;

public interface RegisterDao {
	void insert(RegisterVo registerVo);
	
	List<RegisterVo> search();
	List<RegisterVo> findById(int id);
}
