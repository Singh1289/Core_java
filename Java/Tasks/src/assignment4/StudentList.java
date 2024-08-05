package assignment4;

import java.util.*;

public class StudentList implements Comparable<StudentList> {
	private int rollno;
	private String name;
	private String place;
	
	
	
	public StudentList(int rollno, String name, String place) {
		this.rollno = rollno;
		this.name = name;
		this.place = place;
	}
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}

	public static void insert(LinkedList<StudentList> stu) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter rollno      : ");
		int rollno= s.nextInt();
		System.out.print("Enter name       : ");
		String na= s.nextLine();
		s.nextLine();
		System.out.print("Enter Place  : ");
		String place= s.next();
		stu.add(new StudentList(rollno,na,place));
		System.out.println("Added successfully..!!");
	}
	
	public static void delete(LinkedList<StudentList> stu) {
		Scanner s= new Scanner(System.in);
		System.out.print("Which no. of student to delete  : ");
		int no= s.nextInt();
		stu.remove((no-1));	
		System.out.print("Successfully deleted..!!");
	}
	
	public static void search(LinkedList<StudentList> stu) {
		Scanner s= new Scanner(System.in);
		//StudentList[] a =  (StudentList[]) stu.toArray();
		StudentList[] a = stu.toArray(new StudentList[stu.size()]);
		System.out.println("a = "+a);
		System.out.print("Enter roll no  : ");
		int no= s.nextInt();
		for(StudentList o: a) {
			if(o.rollno==no) System.out.println("Roll no:"+o.rollno+
					  "\nName  :"+o.getName()+
					  "\nPlace :"+o.place);// check print 
		}
	}
	
	public static void showAll(LinkedList<StudentList> stu) {
		
		for(StudentList o: stu)
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Roll no:"+o.rollno+
							  "\nName  :"+o.name +
							  "\nPlace :"+o.place);
			
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void sort(LinkedList stu) {
			Collections.sort(stu);
	}
	
	
	@Override
	public int compareTo(StudentList o) {		
		int r1 = this.rollno;
		int r2 = o.rollno;

		if(r1>r2)
			return +1;
		else if (r1<r2)
			return -1;
		else
			return 0;
	}

	public static void sortbyName(LinkedList<StudentList> stu) {
		Scanner s= new Scanner(System.in);

		System.out.print("Decreasing / Increasing order (D/I)  : ");
		char ch= s.next().charAt(0);
		if(ch=='I'||ch=='i')
			Collections.sort(stu, new MyComparator());
		else
			Collections.sort(stu, new MyComparator2());
	}
	
}
