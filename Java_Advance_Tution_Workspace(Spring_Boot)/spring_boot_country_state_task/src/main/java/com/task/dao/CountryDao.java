package com.task.dao;

import java.util.List;

import com.task.vo.CountryVo;

public interface CountryDao {

	void insertCountry(CountryVo countryVo);
	
	List<CountryVo> searchCountry();
	
	List<CountryVo> findById(int id);
	
}
