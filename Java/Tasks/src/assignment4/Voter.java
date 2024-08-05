package assignment4;
//voter -> voterException -> InvalidAgeExecption
import java.util.Scanner;

public class Voter {
	public static void main(String[] args) throws InvalidAgeExecption {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter voter Id  : ");
		int id = s.nextInt();
		
		System.out.print("Enter Full Name: ");
		String na = s.next();
		
		System.out.print("Enter voter age : ");
		int age = s.nextInt();
		
		VoterException v1= new VoterException(id, age, na);
		
		System.out.println(v1);
	}
}
