package com.pam.alembooks;

public class User {
	String user_id;
	String pw;
	String name;
	public User(String user_id, String pw, String name) {
		super();
		this.user_id = user_id;
		this.pw = pw;
		this.name = name;
	}
	public User() {
		super();
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
