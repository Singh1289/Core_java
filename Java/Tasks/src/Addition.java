
import java.util.Scanner;

public class Addition {
	
	public int add(int a, int b)
	{return a+b;}
	
	public float add(float a, int b)
	{return a+b;}
	
	public float add(int a, float b)
	{return a+b;}
	
	public float add(float a, float b)
	{return a+b;}
	
	public int add(int ...a)
	{
		int sum=0;
		for(int i:a)
		 sum+=i;
		
		return sum;
	}
	
	
	public static void main(String arg[]) 
	{
		Addition a1 = new Addition();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter two values :");
		//int a = s.nextInt();
		//int b = s.nextInt();
		//System.out.println("Sum is  = "+a1.add(s.nextInt(),s.nextInt()));
		//System.out.println("Sum is  = "+a1.add(s.nextFloat(),s.nextInt()));
		//System.out.println("Sum is  = "+a1.add(s.nextInt(),s.nextFloat()));
		System.out.println("Sum is  = "+a1.add(s.nextFloat(),s.nextFloat()));
		
		
		System.out.print("Enter n values :");
		System.out.println("Sum is  = "+a1.add(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()));
		
		System.out.print("Thank you");
		
	}
}
