package assignment;

public class Product {
	private int pId, price, quantity;
	public int sub=0;
	private static int count=100;
	
	public Product(int price, int quantity) {		
		pId = ++count;
		this.price = price;
		this.quantity = quantity;
		sub=price*quantity;
	}
	public static void getHighestPrice(Product[] a) {
		Product temp=a[0];
		for(int i=0;i<a.length-1;i++) {
			if(temp.price<a[i+1].price) temp=a[i+1];
		}
		temp.display();
	}
	public void display() {
		System.out.println("PId      :"+pId+
						"\nPrice    :"+price+
						"\nQuantitiy:"+quantity+
						"\nAmount   :"+sub);
	}	
	
}