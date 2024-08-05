package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private int rollno;
	private float percentage;
	
	public Student() {}
	public Student(int rollno, float percentage) {
		this.rollno = rollno;
		this.percentage = percentage;
	}	
	protected void show()
	{
		System.out.println("Roll no    : "+rollno);
		System.out.println("Percentage : "+percentage);
	}
	
	protected int getRollno() {
		return rollno;
	}
	protected float getPercentage() {
		return percentage;
	}
	
	public static void admission(ArrayList<Student> stu) {
		Scanner s = new Scanner(System.in);
		char choose, ch='Y';
		while(ch=='Y'||ch=='y')
		{
			System.out.print("Want to add School or College student (S/C):");
			choose= s.next().charAt(0);
			if(choose=='S'|| choose=='s') {
				System.out.print("Enter rollno      : ");
				int rollno= s.nextInt();
				System.out.print("Enter class       : ");
				int classno= s.nextInt();
				System.out.print("Enter percentage  : ");
				float per= s.nextFloat();
				stu.add(new School(rollno,per,classno));
			}
			if(choose=='C'|| choose=='c'){
				System.out.print("Enter rollno     : ");
				int rollno= s.nextInt();
				System.out.print("Enter semester   : ");
				int sem= s.nextInt();
				System.out.print("Enter percentage : ");
				float per= s.nextFloat();
				stu.add(new College(rollno,per,sem));
			}
			System.out.print("Do you want to add more student (Y/N): ");
			ch= s.next().charAt(0);
		}
	}
	
	public static void display(ArrayList<Student> stu) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Displaying School Students..");
		for(Object o:stu) {
			if(o instanceof School) {((School) o).show();}
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Displaying College Students..");
		for(Object o:stu) {
			if(o instanceof College) {((College) o).show();}
		}
		
	}
	public static void search(ArrayList<Student> stu) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter roll no of student :");
		int no= s.nextInt();
		for(Object o:stu) {
			if(o instanceof School) {		
			if(((School) o).getRollno() == no) {((School) o).show();}
		}}
		for(Object o:stu) {
			if(o instanceof College) {		
			if(((College) o).getRollno() == no) {((College) o).show();}
		}}
		
	}
	
	public static void count(ArrayList<Student> stu) {
		int co=0,sh=0;
		for(Object o:stu) {
			if(o instanceof School) {
			if(((Student) o).getPercentage() >= 75) {sh++;}
			//if(((College) o).getPercentage() >= 75) {count++;}
			}
		}
		for(Object o:stu) {
			if(o instanceof College) {
			//if(((Student) o).getPercentage() >= 75) {count++;}
			if(((College) o).getPercentage() >= 75) {co++;}
		}
		}	
		System.out.println("Total no of school Student who got A grade is :"+sh);
		System.out.println("Total no of college Student who got A grade is :"+co);
		System.out.println("Total no of Student who got A grade is :"+(co+sh));	
	

   }
}
