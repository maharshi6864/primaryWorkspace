package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="state_spring")
public class StateVo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="state")
	private String state;
	
	@ManyToOne
	@JoinColumn(name="countryOb")
	private CountryVo countryOb;
	
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
	public CountryVo getCountryOb() {
		return countryOb;
	}
	public void setCountryOb(CountryVo countryOb) {
		this.countryOb = countryOb;
	}
}
