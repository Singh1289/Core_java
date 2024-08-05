package date_6_may;

public class String3 {
	public static void main(String[] args) {
		// string Functions
		String s1 = "Java";
		String s2 = "java";
		String s3 = " Java";
		String s4 = "java";    // string class assign two variable refer to one object when 2nd variable 
							   // form have same data as some one else.  
		String s5 = new String ("Java");
		//boolean return 
		System.out.println(s1==s2); // false 
		System.out.println(s1==s3);	// false
		System.out.println(s2==s4); // true    check reference is same or not refer to same object s2 and s4 have same data
		System.out.println(s1==s5); // false
		System.out.println(s2==s5); // false
		
		// length
		System.out.println("length :"+s1.length());// have return type int
		
		//charAt(0)
		System.out.println("char at 3 :"+s1.charAt(3)); // v
		
		System.out.println("trim :"+s3.trim()); // remove spaces
		
		System.out.println("Empty :"+s1.isEmpty());// true false
		
		System.out.println("startwith :"+s1.startsWith("J")); // bool J
		
		System.out.println("endwith :"+s2.endsWith("va")); // bool
		
		System.out.println("SubString one :"+s1.substring(2));//
		
		System.out.println("SubString two :"+s1.substring(2,3));// 2 start 3rd index
		
		System.out.println("Uppercase :"+s1.toUpperCase());
		
		System.out.println("Lowercase :"+s1.toLowerCase());
		
		System.out.println("compare :"+s1.compareTo(s5));
		
		System.out.println("compare ignore :"+s1.compareToIgnoreCase(s2));
		
	}
}
