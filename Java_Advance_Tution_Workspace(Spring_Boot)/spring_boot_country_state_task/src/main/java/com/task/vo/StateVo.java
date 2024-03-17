package com.task.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Spring_Boot_State_Table")
public class StateVo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="state")
	private String state;
	
	@ManyToOne
	@JoinColumn(name="countryOb")
	private CountryVo countryVo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public CountryVo getCountryVo() {
		return countryVo;
	}

	public void setCountryVo(CountryVo countryVo) {
		this.countryVo = countryVo;
	}

	

}
