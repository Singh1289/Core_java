package date_10_may;

import java.util.Scanner;

public class CrossString {
	private int a;
	private int b;
	private int c;
	private int d;
	public CrossString(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int test ,aa,bb,cc,dd;
		boolean in,out;
		while(true) {
			System.out.print("Number of test cases :");
			test = s.nextInt();
			if(test<=5940 && test>0)break;
		}
		System.out.println("Enter string no between 1-12 only.");
		
		CrossString [] cs = new CrossString[test];
		for(int i=0;i<test;i++) {
			System.out.println("......................");
			System.out.println("No: "+(i+1));
			while(true) {
				System.out.println("......................");
				System.out.print("Red 1st number  :");
				 aa = s.nextInt();
				System.out.print("Red 2nd number  :");
				 bb = s.nextInt();
				System.out.print("Blue 1st number :");
				 cc = s.nextInt();
				System.out.print("Blue 2nd number :");
				 dd = s.nextInt();
				if((aa<=12 && aa>0)
					&&(bb<=12 && bb>0)
					&&(cc<=12 && cc>0)
					&&(dd<=12 && dd>0))	
					break;
			
				System.out.println("Enter again..");
			}
			cs[i] = new CrossString(aa, bb, cc, dd);
		}
		
		for(CrossString o: cs) {
			if(o.a>o.b) {
				if(o.c>o.b && o.c<o.a) in=true; else in=false;
				if(o.d>o.b && o.d<o.a) out=true; else out=false;
			}else {
				if(o.c>o.a && o.c<o.b) in=true; else in= false;
				if(o.d>o.a && o.d<o.b) out=true; else out = false;
				
			}
				
			if(in!=out)
				System.out.println("Yes");
			else
				System.out.println("No");
			
		}
		
	}
}
