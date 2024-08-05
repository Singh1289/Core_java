package assignment;

//office ----faculty----fulltime-----parttime
public class FullTimeFaculty extends Faculty {
	private int basic, allowance;

	public FullTimeFaculty(int facultyId, int basic, int allowance) {
		super(facultyId);
		this.basic = basic;
		this.allowance = allowance;
		salary=basic+allowance;
	}
	
	public void display() {
		super.display();
		System.out.println("Salary     : "+(basic+allowance));
	}
	
}
