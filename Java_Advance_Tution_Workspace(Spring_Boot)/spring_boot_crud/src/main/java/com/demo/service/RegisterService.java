package com.demo.service;

import java.util.List;

import com.demo.model.RegisterVo;

public interface RegisterService {

	void insert(RegisterVo regVO);

	List<RegisterVo> search();

	List<RegisterVo> findById(int id);
}
