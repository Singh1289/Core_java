package date_8_may;

import java.util.ArrayList;

import java.util.Collections;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("R");
		l.add("C");
		System.out.println("Before Sorting --->"+l);
		//l.add(new Integer(10));
		//l.add(null);
		Collections.sort(l);
		Collections.sort(l, new MyComparator1());
		System.out.println("After Sorting --->"+l);
	}


	
}
