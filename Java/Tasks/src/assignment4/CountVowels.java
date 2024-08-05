package assignment4;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter you name :");
		String name = s.nextLine();
		
		char na[]= name.toCharArray();
		int count=0;
		
		for(char c:na) {
			if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'
					||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
			{
				count++;
			}
		}
		
		System.out.println("No. of vowels :");		
		
	}
}
