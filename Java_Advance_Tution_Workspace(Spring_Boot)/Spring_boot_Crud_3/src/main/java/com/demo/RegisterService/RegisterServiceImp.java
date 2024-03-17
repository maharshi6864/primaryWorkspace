package com.demo.RegisterService;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Dao.RegisterDao;
import com.demo.Vo.RegisterVo;

@Service
@Transactional
public class RegisterServiceImp implements RegisterService{

	@Autowired
	private RegisterDao registerDao;
	
	@Override
	public void insert(RegisterVo registerVo) {
		this.registerDao.insert(registerVo);
		
	}

	@Override
	public List<RegisterVo> search() {
		List<RegisterVo> searchList=this.registerDao.search();
		return searchList;
	}

	@Override
	public List<RegisterVo> findById(int id) {
		List<RegisterVo> editList=this.registerDao.findById(id);
		return editList;
	}
	
		
}
