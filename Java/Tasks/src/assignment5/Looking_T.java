package assignment5;

import java.util.Scanner;

public class Looking_T {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter String : ");
		String n = s.nextLine();
		int count=0;
		n= n.toLowerCase();
		char []a= n.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if( a[i] =='t')
				count++;
		}
		System.out.println("t :"+count);
	}
}
