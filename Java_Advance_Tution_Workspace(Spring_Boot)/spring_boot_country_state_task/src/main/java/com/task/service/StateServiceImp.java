package com.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.task.dao.CountryDao;
import com.task.dao.StateDao;
import com.task.vo.CountryVo;
import com.task.vo.StateVo;


@Service
@Transactional
public class StateServiceImp implements StateService {

	@Autowired
	private CountryDao countryDao; 
	
	@Autowired
	private StateDao stateDao;
	
	
	public List<CountryVo> getCountryList() {
		List<CountryVo> getCountryList=this.countryDao.searchCountry();
		return getCountryList;
	}


	public void insertState(StateVo stateVo) {
		this.stateDao.insertState(stateVo);
		
	}


	public List<StateVo> searchState() {
		List<StateVo> searchStateList=this.stateDao.searchState();
		return searchStateList;
	}


	public List<StateVo> findById(int id) {
		List<StateVo> searchStateList=this.stateDao.findById(id);
		return searchStateList;
	}

}
