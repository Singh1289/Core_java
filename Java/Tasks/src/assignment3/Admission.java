package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Admission {
	public static void main(String[] args) {
		ArrayList <Student> stu = new ArrayList();
		boolean x= true;
		
		Scanner s= new Scanner(System.in);
		while(x==true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~ Welcome to ABC University ~~");
			System.out.println("   1. Take admission");
			System.out.println("   2. Display all records");
			System.out.println("   3. Search a Student by roll no.");
			System.out.println("   4. Count how many got A grade");
			System.out.println("   5. Exit");
			int choice = s.nextInt();
			switch(choice) {
			case 1: Student.admission(stu);
					break;
			case 2: Student.display(stu);
					break;
			case 3: Student.search(stu);
					break;
			case 4: Student.count(stu);
					break;
			case 5: x=false;
					break;
			default: System.out.println("Please choose from give option..!");
			}
		}
		System.out.println("~~~: Thank you :~~~");
		
	}
}
