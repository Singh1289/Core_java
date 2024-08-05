package assignment;

//office -faculty-full time-part time
public class PartTimeFaculty extends Faculty {
	private int hour,rate;

	public PartTimeFaculty(int facultyId, int hour, int rate) {
		super(facultyId);
		this.hour = hour;
		this.rate = rate;
		salary=hour*rate;
	}

	
	public void display() {
		super.display();
		System.out.println("Salary     : "+(hour*rate));
	}
	
	
}