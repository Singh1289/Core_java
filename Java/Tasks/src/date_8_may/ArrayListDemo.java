package date_8_may;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		String s[] = {"A","Z","X","C"};
		List l =Arrays.asList(s);
		System.out.println(l);
		s[0]="B";
		System.out.println(l);
		l.set(1, "L");
		System.out.println(l);
		//l.add("M");
		//l.set(0, new Integer(10));
		// can set /update value by array or list but can't remove or add by list
	}
}
