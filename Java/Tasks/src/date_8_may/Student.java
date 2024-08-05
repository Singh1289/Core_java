package date_8_may;

import java.io.Serializable;

public class Student implements Serializable{
	private transient int rollno;
	private String name;
	public Student() {}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
