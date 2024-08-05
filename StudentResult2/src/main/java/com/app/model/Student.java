package com.app.model;

public class Student {
	private long PRN;
	private String student_Name;
	private int internal;
	private int MCQ;
	private int practical;
	
	public Student() {}

	public long getPRN() {
		return PRN;
	}

	public void setPRN(long pRN) {
		PRN = pRN;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public int getInternal() {
		return internal;
	}

	public void setInternal(int internal) {
		this.internal = internal;
	}

	public int getMCQ() {
		return MCQ;
	}

	public void setMCQ(int mCQ) {
		MCQ = mCQ;
	}

	public int getPractical() {
		return practical;
	}

	public void setPractical(int practical) {
		this.practical = practical;
	}
	
	
}
