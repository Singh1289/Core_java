
public class DateSwap {
	private int d,m,y;
	
	public DateSwap() {}
	
	public DateSwap(int i, int j, int k) {
		d=i;
		m=j;
		y=k;
	}

	public static void swap(DateSwap a,DateSwap b) {
		//DateSwap c= new DataSwap();
//		c=a;
//		a=b;
//		b=c;
	}

	
	public String toString() {
		return "DateSwap [ " + d + "/" + m + "/" + y + " ]";
	}

	public static void main(String[] args) {
		DateSwap d1 = new DateSwap(22,12,2024);
		DateSwap d2 = new DateSwap(10,2,2014);
		DateSwap d3 = new DateSwap();
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("after swap");
		//swap(d1,d2);
	
//		d3=d1;
//		d1=d2;
//		d2=d3;
		
		System.out.println(d1);
		System.out.println(d2);
		
	}
}
