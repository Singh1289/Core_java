import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		Factorial fact = new Factorial();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. : ");
		int num = s.nextInt();
		
		System.out.println("Factorial is : "+ fact(num));
		
	}
	
	public static int fact(int a)
	{
		int temp=1, i;
		for(i=1;i<=a;i++)
		{
			temp *=i;
		}
		return temp;
	}
}
