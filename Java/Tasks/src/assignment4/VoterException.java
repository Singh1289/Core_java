package assignment4;
// voter -> VoterException ->InvalidAgeExecption
public class VoterException {
	private int voterId, age;
	private String name;
	public VoterException(int voterId, int age, String name) throws InvalidAgeExecption {
		if(age<18) {
			throw new InvalidAgeExecption("Invalid Age for Voter");
		}
		this.voterId = voterId;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "VoterException [voterId=" + voterId + ", age=" + age + ", name=" + name + "]";
	}
	
}
