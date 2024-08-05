package assignment;
//flats -- one BHK --two BHK
public class TwoBHK extends OneBHK{

	private float room2Area;
	
	public TwoBHK() {
	}

	public TwoBHK(float roomArea, float hallArea, long price, float room2Area) {
		super(roomArea, hallArea, price);
		this.room2Area = room2Area;
	}
	

public void show() {
		super.show();
		System.out.println("Room2Area:"+room2Area);
	}
	
}
