import java.util.Scanner;

public class Circle {
	
	
	public float area(float r)
	{
		return (3.14f* r *r);
	}
	public float circumfrence(float r)
	{
		return  (2*3.14f*r);
	}
	
	public static void main(String[] args) {
		Circle c1= new Circle();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius: ");
		float r= s.nextFloat();
		
		System.out.println("Circumfrence is = "+ c1.circumfrence(r));
		System.out.println("Area is = "+ c1.area(r));
		
	}
}
