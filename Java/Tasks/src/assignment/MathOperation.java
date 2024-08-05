package assignment;
import java.util.Scanner;

public class MathOperation {

	private static int x,y;
	private static long r;
	
	public MathOperation() {}
		
	public static void init() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of x:");
		int a= s.nextInt();
		System.out.println("Enter value of y:");
		int b=s.nextInt();
		x=a;
		y=b;
	 }

	public static void add() {
		r =x+y;
	 }
	
	public static void power() {
		int temp=1;
		for(int i=1; i<=y;i++)
			temp *=x;
		r=temp;
	}

	public static void multi() {
		r=x*y;
	}
	public static String display() {
		return ("x=" + x + ", y=" + y + ", r=" + r);
	}
	
	public static void main(String[] args) {
		
		
		MathOperation m1 = new MathOperation();
		MathOperation.init();
		
		MathOperation.add();
		System.out.println("Addition : "+m1.display());
		
		MathOperation.multi();
		System.out.println("Multiplication : "+m1.display());
		
		MathOperation.power();
		System.out.println("Power : "+m1.display());
	
	}

	
}