package assignment;

import java.util.Scanner;

public class ProMain {
	private static int total=0;
	
	
	
	public static int calTotal(Product []a) {
		for(int i=0;i<a.length;i++) {
			total+=a[i].sub;
		}
		return total;
	}
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("enter total no of product :");
		int size = s.nextInt();
		Product p[] = new Product[size];
		
		for(int i=0;i<p.length;i++)
		{
			System.out.print("Enter price    :");
			int price = s.nextInt();
			System.out.print("Enter quantity :");
			int quant = s.nextInt();
			p[i] = new Product(price,quant);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Highest Price");
		
		Product.getHighestPrice(p);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(Product i:p) {
			i.display();
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Total amount spent: "+calTotal(p));
		
	}
	
}