package date_6_may;

public class B extends A {
	public static void main(String[] args) {
		A a= new B();
		A c= new A();
		B b = new B();
		
		System.out.println(a instanceof A );//true
		System.out.println(c instanceof B );//false
		System.out.println(b instanceof B );//true
	}
}
