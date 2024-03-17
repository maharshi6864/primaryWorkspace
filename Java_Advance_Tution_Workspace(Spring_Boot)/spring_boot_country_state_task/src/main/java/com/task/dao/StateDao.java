package com.task.dao;

import java.util.List;

import com.task.vo.StateVo;

public interface StateDao {
	
	void insertState(StateVo stateVo);
	
	List<StateVo> searchState();

	List<StateVo> findById(int id);
}
