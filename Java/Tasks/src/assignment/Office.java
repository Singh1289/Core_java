package assignment;
//office -faculty-full time-part time
import java.util.Scanner;

public class Office {
	public static void main(String[] args) {
		FullTimeFaculty fullArr[][]= new FullTimeFaculty[1][];
		PartTimeFaculty partarr[][]= new PartTimeFaculty[1][10];
		Scanner s= new Scanner(System.in);
		int fu=0,pa=0;
		char ch='Y',choose;
		System.out.println("~~ Welcome to ABC collage ~~");
		while(ch=='Y'||ch=='y')
		{
			System.out.print("Want to add full time or part time faculty (F/P):");
			choose= s.next().charAt(0);
			if(choose=='F'|| choose=='f') {
				System.out.print("Enter faculty ID : ");
				int id= s.nextInt();
				System.out.print("Enter basic      : ");
				int ba= s.nextInt();
				System.out.print("Enter allowance  : ");
				int al= s.nextInt();
				fullArr[0][fu]= new FullTimeFaculty(id,ba,al);
				fu++;
			}
			if(choose=='P'|| choose=='p'){
				System.out.print("Enter faculty ID    : ");
				int id= s.nextInt();
				System.out.print("Enter total hour    : ");
				int hr= s.nextInt();
				System.out.print("Enter rate per hour : ");
				int ra= s.nextInt();
				partarr[0][pa]= new PartTimeFaculty(id,hr,ra);
				pa++;
			}
			System.out.print("Do you want to add more faculty (Y/N): ");
			ch= s.next().charAt(0);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Display full-time faculty");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<fullArr[0].length;i++) {
			if(fullArr[0][i] != null) {
		        fullArr[0][i].display(); 
		    }
		}
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Display part-time faculty");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<partarr[0].length;i++) {
			if(partarr[0][i] != null) {
				partarr[0][i].display(); 
		    }
		}
		
	}
}