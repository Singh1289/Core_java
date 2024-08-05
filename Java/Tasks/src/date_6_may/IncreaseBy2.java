package date_6_may;

public class IncreaseBy2 {
	public static void main(String[] args) {
		IncreaseFive2 i = (x) -> {return (x+5);};
		
		
		System.out.println("Increase : "+i.getNo());
		System.out.println("Increase : "+i.inc(4));
		 i = (x) -> {return (x*50);};
		System.out.println("Increase : "+i.inc(4));
		System.out.println("Increase : "+IncreaseFive2.getString());
	}
}
