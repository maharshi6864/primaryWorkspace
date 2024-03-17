package com.vo;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.vo.LoginVo;

@Entity
@Table(name="register_Spring")
public class RegisterVo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private String firstname;
	private String lastname;
	@ManyToOne
	@JoinColumn(name="loginid")
	private LoginVo loginOb;
	
	public LoginVo getLoginOb() {
		return loginOb;
	}
	public void setLoginOb(LoginVo loginOb) {
		this.loginOb = loginOb;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
