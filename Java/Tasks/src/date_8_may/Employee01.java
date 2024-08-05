package date_8_may;


public class Employee01 implements Comparable{
	 int empID;
  String empName;

	public Employee01(int empID, String empName) {
		
		this.empID = empID;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}
	@Override
	public int compareTo(Object o) {
		int eid1 = this.empID;
		Employee01 e = (Employee01)o;
		int eid2= e.empID;
		if(eid1<eid2) 
			return-1; 
		else if(eid1>eid2)
			return +1; 
		else 
			return 0; 
	}
	
}
