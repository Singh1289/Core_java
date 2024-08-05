package date_6_may;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(null);
		hs.add("abc");
		hs.add("101");
		hs.add(55);
		hs.add('A');
		System.out.println("return value of add: "+hs.add(20));//true
		System.out.println("return value of add: "+hs.add(20));//false
		System.out.println(hs);
		//System.out.println("101 :"+hs[3]); error
	}
}
/*
 * duplicates are not allowed.
 * null can add only once.
 * no random access
 * insertion order is not preserved
 * 
 */