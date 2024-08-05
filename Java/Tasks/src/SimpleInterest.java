import java.util.Scanner;

public class SimpleInterest {

 public float si(float prin ,float roi,float time){
	 
	 return (prin*roi*time)/100;
	 
 }
 
 public static void main(String[] args) {
	 float pr,roi,tim;
	 SimpleInterest s1 = new SimpleInterest();
	Scanner s= new Scanner(System.in);
	System.out.print("Enter Principle Amount:");
	pr=s.nextFloat();
	System.out.print("Enter Rate of interest:");
	roi=s.nextFloat();
	System.out.print("Enter time in Year:");
	tim=s.nextFloat();
	
	System.out.println("Simple interest is : "+ s1.si(pr, roi, tim));
	System.out.println("Total amount is : "+(pr+ s1.si(pr, roi, tim)));
	
}
}

