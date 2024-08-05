package assignment3;

public class School extends Student{
	
	private int classno;
	public School() {
		super();
	}
	public School(int rollno, float percentage,int classno) {
		super(rollno, percentage);
		this.classno=classno;
	}
	
	protected void show()
	{
		super.show();
		System.out.println("Class      : "+classno);
		
	}	
	
}
