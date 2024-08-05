package date_6_may;

import java.util.LinkedHashSet;

public class LinkedHashDemo {
	
		public static void main(String[] args) {
			LinkedHashSet hs = new LinkedHashSet();
			hs.add(null);
			hs.add("abc");
			hs.add("101");
			hs.add(55);
			hs.add('A');
			System.out.println("return value of add: "+hs.add(20));//true
			System.out.println("return value of add: "+hs.add(20));//false
			System.out.println(hs);
			//System.out.println("101 :"+hs[3]); //error
			hs.remove(55);
			System.out.println(hs);
			System.out.println(hs.add(45));
			System.out.println(hs);
			System.out.println(hs.remove('A'));
			System.out.println(hs);
		}
	}
	/*
	 * duplicates are not allowed.
	 * null can add only once.
	 * no random access
	 * insertion order is preserved
	 * can remove
	 */

