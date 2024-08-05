package assignment4;

import java.util.HashMap;
import java.util.Scanner;

public class WeekDay {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	  /*HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(0,"Sunday");
		hm.put(1,"Monday");
		hm.put(2,"Tuesday");
		hm.put(3,"Wednesday");
		hm.put(4,"Thursday");
		hm.put(5,"Friday");
		hm.put(6,"Saturday");*/
		String []day= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};		
		System.out.print("Enter Day Position : ");
		int input = s.nextInt();
		
		try {
			String name = getDayName(day,input);
			System.out.println(input+" "+name);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Entered number is not in range 0-6..!!");
		}
		
	}

	private static String getDayName(String[] day, int input) {
		return day[input];
	}
}
