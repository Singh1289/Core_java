package date_8_may;

import java.util.Comparator;

public class MyComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = o2.toString();		
		return s2.compareTo(s1);
	}



}
