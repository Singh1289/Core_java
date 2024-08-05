package assignment4;

import java.util.Scanner;

public class Student_fee_main {
	public static void main(String[] args) throws InvalidFeeException {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter name :");
		String name = s.nextLine(); 
		System.out.println("Enter fee  :");
		int fee = s.nextInt();
		
		Student_fee s1 = new Student_fee(fee, name);
		
		System.out.println("Fee :"+s1.getFee());
		
	}
}
