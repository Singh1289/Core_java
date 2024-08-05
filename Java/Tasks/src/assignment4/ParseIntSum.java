package assignment4;

import java.util.Scanner;

public class ParseIntSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter string :");
		String input = s.nextLine();
		String check= "[,\\' ']";
		String [] str = input.split(check);
		int sum=0;
		for(String as:str) {
			int temp = Integer.parseInt(as);
			sum +=temp;
		}
		
		System.out.println("Sum is : "+sum);
	}
}
