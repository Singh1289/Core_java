import java.util.Scanner;
public class Swap_num {
	public static void main(String args[])
	{
		Swap_num sn = new Swap_num();
		Scanner s = new Scanner(System.in);
		System.out.print("enter first no. : ");
		int a = s.nextInt();
		System.out.print("enter second no. : ");
		int b = s.nextInt();
		swap(a,b);
		
	}
	
	public static void swap(int a, int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a : "+a+ "  b : "+b);
	}
}
