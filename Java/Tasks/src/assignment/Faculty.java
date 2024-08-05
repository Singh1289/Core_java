package assignment;

//office -faculty-full time-part time
public class Faculty {
	private int facultyId;
	protected int salary;

	public Faculty(int facultyId) {
		this.facultyId = facultyId;
		
	}

	public void display() {
		System.out.println("Faculty Id : "+facultyId);
	}
}
