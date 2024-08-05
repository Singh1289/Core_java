package date_10_may;
/* Write a program to count no of words in a text file and word size.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAssCountTotal {
	public static void main(String[] args) throws FileNotFoundException {
		File mi=new File("C:\\Users\\adity\\Desktop\\New folder\\mno.txt");
		Scanner sc=new Scanner(mi);
		String n=null;
		int Count=0;
		while(sc.hasNextLine())
		{
			n=sc.nextLine();
			System.out.println(n);
			for(int i=0 ; i<n.length();i++)
			{
				if(n.charAt(i)=='t'|| n.charAt(i)=='T')
				{
					Count++;
					//System.out.println(Count);
				}
			}
		}
		
		System.out.println("count 1: "+Count);
		System.out.println(n);  // before when you are reading it you store in single variable to n has only last line
								
		Count=0;
		for(int i=0 ; i<n.length();i++)
		{
			if(n.charAt(i)=='t'|| n.charAt(i)=='T')
			{
				Count++;
				//System.out.println(Count);
			}
		}
		 System.out.println("Count 2 :"+Count);
		
	}

}
