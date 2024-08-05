package assignment;

import java.util.Scanner;

public class Employee {
	 private int empNo,salary;
	 private static int count=200,totalSalary=0;
	 
	 public Employee(int salary) {
		 empNo= ++count;
		 this.salary=salary;
		 totalSalary += salary;
	 }
	public static int getCount() {
		 return count;
	 }
	public static int getSal() {
		 return totalSalary;
	 }
	public void display() {
		System.out.println("Employee no :"+empNo+
							"\nSalary      :"+salary);
	}
	public static void displayTotal() {
		System.out.println("Total employee: "+(count-200)+
						"\nTatal Salary  :"+totalSalary);
	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("Total no of employee : ");
		int size= s.nextInt();
		Employee e[]= new Employee[size];
		
		for(int i=0; i<e.length;i++) {
			System.out.print("Enter salary of a employee : ");
			int sal = s.nextInt();
			e[i]= new Employee(sal);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(Employee i:e) {
			i.display();
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		Employee.displayTotal();
		
	}
}