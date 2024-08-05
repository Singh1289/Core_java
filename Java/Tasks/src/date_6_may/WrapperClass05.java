package date_6_may;

public class WrapperClass05 {
	
	// wrapping the primitive datatype into class
	// wrapper classes are final class so we can't change it value after instantiated
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		int a=10;
		//boxing
		//primitive to wrapper
		Integer i= new Integer(a); //old version
		
		Integer j= a; // auto boxing 
		int b=a;	  //  ,,
		
		//wrapper to primitive
		int c = i.intValue();
		System.out.println("Wrapper to pri : "+c);
		
		//String to primitive
		String str = "40";
		int s = Integer.parseInt(str);
		System.out.println("String to pri : "+s);
		
		//String to wrapper
		Integer ab = Integer.getInteger(str);
		System.out.println("String to wrapper : "+ab);
		
		
	}
}
