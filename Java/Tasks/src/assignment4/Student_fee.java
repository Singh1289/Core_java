package assignment4;

public class Student_fee implements StudentFee{
	private int fee;
	private String name;
	@Override
	public int getFee() throws InvalidFeeException{
		if(fee<0) {throw new InvalidFeeException("Fee should not be less than zero ");}
		else if(fee==0) {throw new InvalidFeeException("Fee should not be zero ");}
		else if(fee>30000) {throw new InvalidFeeException("Fee should not more than 30000 ");}
		return fee;
	}
	public Student_fee(int fee, String name) {
		this.fee = fee;
		this.name = name;
	}
}
