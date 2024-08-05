package assignment;
//flats -- one BHK --two BHK
import java.util.Scanner;

public class Flats {
 public static void main(String[] args) {
	 TwoBHK b[] = new TwoBHK[3];
	 Scanner s = new Scanner(System.in);
	 
	 for(int i=0;i<b.length;i++) {
		 System.out.println("Enter 1st room area :");
		 float a1= s.nextFloat();
		 System.out.println("Enter 2nd room area :");
		 float a2= s.nextFloat();
		 System.out.println("Enter hall area :");
		 float h= s.nextFloat();
		 System.out.println("Enter price :");
		 long price= s.nextLong();
		 b[i]= new TwoBHK (a1,h,price,a2);
	 }
	 
	 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	 for(TwoBHK i: b) {
		 i.show();
	 }
	 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	 System.out.println("Total amount of all flats: "+TwoBHK.getTotal());
	 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
}
}