import java.util.Scanner;

public class Accessor {
	//Mutators
	private int dd,mm,yy;
	
	public void setDd(int a)
	{dd=a;}
	public void setMm(int a)
	{mm=a;}
	public void setYy(int a)
	{yy=a;}
	
	//Accessors
	public int getDd()
	{return dd;}
	public int getMm()
	{return mm;}
	public int getYy()
	{return yy;}
	
	public void display()
	{
		System.out.println("Date : "+dd+"/"+mm+"/"+yy);
	}
	
	public String toString() {
		return "Date: [day=" + dd + ", month=" + mm + ", year=" + yy + "]";
	}
	
	
	public static void main(String []args)
	{
		int d, m, y;
		Accessor a1= new Accessor();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter date (dd,mm,yy) :");
		d= s.nextInt();
		m= s.nextInt();
		y= s.nextInt();
		a1.setDd(d);
		a1.setMm(m);
		a1.setYy(y);
		
		System.out.print("day is : "+ a1.getDd()+"\n");
		
		a1.display();
		
		System.out.println(a1);
		
		
	}
}
