package assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathMulti {
	
	public static int multiplication(int a, int b) {return a*b;}
	public static float multiplication(float a, float b,float c) {return a*b*c;}
	public static double multiplication(double a, int b) {return a*b;}
	public static int multiplication(int[] a) {
		int temp=1;
		for(int i:a) temp*=i;
		return temp;
		}
	private static DecimalFormat change = new DecimalFormat("0.00"); 
	
	public static void main(String[] args) {
		int []a = {12,04,18,6,15};
		System.out.println("int * int :"+multiplication(24,52));
		System.out.println("Float * float * float :"+change.format(multiplication(12.5f,24.25f,2.6f)));
		System.out.println("double * int :"+change.format(multiplication(24.356,52)));
		System.out.println("Array :"+multiplication(a));
	}
}