package com.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.task.dao.CountryDao;
import com.task.vo.CountryVo;

@Service
@Transactional
public class CountryServiceImp implements CountryService {

	@Autowired
	private CountryDao countryDao;
	
	public void insertCountry(CountryVo countryVo) {
		this.countryDao.insertCountry(countryVo);
		
	}

	public List<CountryVo> searchCountry() {
		List<CountryVo> searchCountryList=this.countryDao.searchCountry();
		return null;
	}

	public List<CountryVo> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
