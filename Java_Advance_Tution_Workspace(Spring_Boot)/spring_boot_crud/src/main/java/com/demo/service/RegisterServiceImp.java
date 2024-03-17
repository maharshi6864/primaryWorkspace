package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.RegisterDAO;
import com.demo.model.RegisterVo;


@Service
@Transactional
public class RegisterServiceImp implements RegisterService{

	@Autowired
	private RegisterDAO registerDao;
	
	@Override
	public void insert(RegisterVo regVO) {
		this.registerDao.insert(regVO);
		
	}

	@Override
	public List<RegisterVo> search() {
		return this.registerDao.search();
	}

	@Override
	public List<RegisterVo> findById(int id) {
		return this.registerDao.findById(id);
	}
	
}
