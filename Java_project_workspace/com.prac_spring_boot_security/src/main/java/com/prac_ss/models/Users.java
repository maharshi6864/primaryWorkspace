package com.prac_ss.models;

public class Users {

	String username;

	String password;

	String emailID;

	public Users() {

	}

	public Users(String username, String password, String emailId) {
		this.username = username;
		this.password = password;
		this.emailID = emailId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}
