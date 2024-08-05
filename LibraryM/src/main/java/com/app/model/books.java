package com.app.model;

public class books {
	private String bname;
	private String author;
	private String stu_name;
	private int active;
	public books() {
		
	}
	public books(String bname, String author, String stu_name, int active) {
		
		this.bname = bname;
		this.author = author;
		this.stu_name = stu_name;
		this.active = active;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	
	
}
