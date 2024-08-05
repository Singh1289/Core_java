package assignment3;

public class College extends Student {
	private static int sh=0,cl=0;
	private int semester;
	public College() {
		super();
	}
	public College(int rollno, float percentage,int semester) {
		super(rollno, percentage);
		this.semester= semester;
	}
	
	protected void show()
	{
		super.show();
		System.out.println("Semester   : "+semester);
	}	
	
}
