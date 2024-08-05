import java.util.Scanner;

public class EvenOdd {

	public String check(int a) {
	  return (a%2==0)?"Even":"Odd";
	}
	
	public static void main(String[] args) {
		
		EvenOdd eo =new EvenOdd();
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any Number");
		int a= s.nextInt();
		
		System.out.println(eo.check(a));
	}
}
