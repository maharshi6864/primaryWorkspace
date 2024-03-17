package com.task.service;



import java.util.ArrayList;
import java.util.List;

import com.task.vo.CountryVo;


public interface CountryService {

	void insertCountry(CountryVo countryVo);
	
	List<CountryVo> searchCountry();
	
	List<CountryVo> findById(int id);
}
