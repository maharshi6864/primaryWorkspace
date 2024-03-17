package com.task.service;

import java.util.List;

import com.task.vo.CountryVo;
import com.task.vo.StateVo;

public interface StateService {
	
	List<CountryVo> getCountryList();
	
	void insertState(StateVo stateVo);
	
	List<StateVo> searchState();

	List<StateVo> findById(int id);

}
