package assignment;
//flats -- one BHK --two BHK
public class OneBHK {
	private float roomArea,hallArea;
	private long price;
	private static long total=0;
	public OneBHK() {
	}
	
	
	public OneBHK(float roomArea, float hallArea, long price) {
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
		total +=price;
	}
	
	public void show() {
		System.out.println("RoomArea:"+roomArea+
							"\nHallArea:"+hallArea+
							"\nPrice:"+price);
	}
	public static long getTotal() {
		return total;
	}
	
	
}
