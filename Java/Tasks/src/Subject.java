import java.util.Scanner;

public class Subject {
	
	
	
	public int sum(int a,int b,int c,int d,int e) {
		return a+b+c+d+e;
	}
	
	public float percentage(int sum) {
		return (float) sum/5;
	}
	
	public static void main(String[] args) {
		Subject s1 = new Subject();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Marks of (Eng,Maths,Sci,react,html) subjects Out of 100:");
		int eng=s.nextInt();
		int math=s.nextInt();
		int sci=s.nextInt();
		int react=s.nextInt();
		int html=s.nextInt();
		//int sum = s1.sum(eng, math, sci, html, react);
		System.out.println("Sum of all Subject is :"+s1.sum(eng, math, sci, html, react));
		System.out.println("Percentage is :"+s1.percentage(s1.sum(eng, math, sci, html, react))+" %");
		
	}
}
