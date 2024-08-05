import java.util.Scanner;

public class Fibonacci {

	public static void main(String arg[])
	{
		Fibonacci fb = new Fibonacci();
		Scanner se = new Scanner(System.in);
		System.out.print("enter value of n : ");
		int n = se.nextInt();
		
		printSeries(n);
	}
	
	public static void printSeries(int a)
	{
		int first =0,sec=1,i,temp;
		System.out.print("Series : "+ first+ " ");
		System.out.print(sec+ " ");
		for(i=1;i<=(a-2);i++)
		{
			temp = first + sec;
			System.out.print(temp + " ");			
			first=sec;
			sec = temp;
		}
	}
}
