package com.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Register_api")
public class RegisterVo {
	
	@Override
	public String toString() {
		return "RegisterVo [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", logiinVo=" + logiinVo
				+ ", status=" + status + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String firstname;
	
	private String lastname;
	
	
	@JoinColumn(name="login_vo")
	@ManyToOne
	private LoginVo logiinVo;
	
	private Boolean status=true;

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

	public LoginVo getLogiinVo() {
		return logiinVo;
	}

	public void setLogiinVo(LoginVo logiinVo) {
		this.logiinVo = logiinVo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}
