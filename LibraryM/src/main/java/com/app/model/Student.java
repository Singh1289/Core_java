package com.app.model;

public class Student {
	private String fname;
	private String username;
	private String email;
	private String password;
	private String gender;
	private long mobile;
	
	public Student() {}

	public Student(String fname, String username, String email, String password, String gender, long mobile) {
		this.fname = fname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.mobile = mobile;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", mobile=" + mobile + "]";
	}
	
	
	
	
	
}
