package date_6_may;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList <String> l = new LinkedList<String>();
		
		l.add("Abhi");
		l.add("Raj");
		l.add("Ravi");
		l.add("Mukul");
		l.add("piyush");
		
		System.out.println(l);
		
		System.out.println("moving in forword direction..!!");
		ListIterator<String> itr = l.listIterator();
		
		while(itr.hasNext()) {
			//System.out.println("entered");
			String str = (String) itr.next();
			if(itr.equals("Ravi")) 
			{
				itr.set("Yadav");
				}
		}
		System.out.println("moving backwarks");
		while(itr.hasPrevious()) {
			System.out.println(itr);
			itr.previous();			
		}
		
		
		System.out.println(l);
	}
}
