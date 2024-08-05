package date_8_may;

import java.util.TreeSet;

public class EmpMain01 {
	public static void main(String[] args) {
		Employee01 e1 = new Employee01(101, "Raj");
		Employee01 e2 = new Employee01(102, "John");
		Employee01 e3 = new Employee01(103, "Scahin");
		Employee01 e4 = new Employee01(104, "Manish");
		Employee01 e5 = new Employee01(105, "Rohit");
		
		//TreeSet t = new TreeSet();
		TreeSet t = new TreeSet(new MyComparator());
			t.add(e1);
			t.add(e2);
			t.add(e3);
			t.add(e4);
			t.add(e5);
			System.out.println(t);

	}
}
