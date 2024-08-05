package assignment4;

import java.util.*;

//studentList -> StudLinkedList -> 
public class StudLinkedList {
	public static void main(String[] args) {
		LinkedList<StudentList> stu = new LinkedList<StudentList>();
		
		boolean x= true;
		Scanner s= new Scanner(System.in);
		while(x==true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~ Welcome to ABC University ~~");
			System.out.println("   1. Take admission");
			System.out.println("   2. Display all records");
			System.out.println("   3. Remove a Student");
			System.out.println("   4. Sort Student by rollno");
			System.out.println("   5. Sort Student by name");
			System.out.println("   6. Search student");
			System.out.println("   7. Exit");
			int choice = s.nextInt();
			switch(choice) {
			case 1: StudentList.insert(stu);
					break;
			case 2: StudentList.showAll(stu);
					break;
			case 3: StudentList.delete(stu);
					break;
			case 4: StudentList.sort(stu);
					break;
			case 5: StudentList.sortbyName(stu);
					break;
			case 6: StudentList.search(stu);
					break;
			case 7: x=false;
					break;
			default: System.out.println("Please choose from give option..!");
			}
		}
		System.out.println("~~~: Thank you :~~~");
		
	}
}
