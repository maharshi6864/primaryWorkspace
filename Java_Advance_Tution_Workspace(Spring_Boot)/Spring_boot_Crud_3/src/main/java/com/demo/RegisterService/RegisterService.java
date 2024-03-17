package com.demo.RegisterService;

import java.util.List;

import com.demo.Vo.RegisterVo;

public interface RegisterService {
	void insert(RegisterVo registerVo);
	
	List<RegisterVo> search();

	List<RegisterVo> findById(int id);
}
