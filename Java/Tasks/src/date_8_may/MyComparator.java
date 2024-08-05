package date_8_may;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee01> {

	@Override
	public int compare(Employee01 o1, Employee01 o2) {
		String s1 = o1.empName;
		String s2 = o2.empName;		
		return s1.compareTo(s2);
	}



}
