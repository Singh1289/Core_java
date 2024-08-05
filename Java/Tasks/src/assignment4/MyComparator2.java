package assignment4;

import java.util.Comparator;
import java.util.Scanner;

public class MyComparator2 implements Comparator<StudentList>{

	@Override
	public int compare(StudentList o1, StudentList o2) {
		Scanner s= new Scanner(System.in);
		String s1 = o1.getName();
		String s2 = o2.getName();
			
		return s2.compareTo(s1);		
	}

}