package date_6_may;

public class StringBuffer04 {
	public static void main(String[] args) {
		
	
	StringBuffer sb= new StringBuffer("Core");
	sb=sb.append(" Java");
	System.out.println("Append :"+ sb);
	sb=sb.reverse();
	System.out.println("reverse :"+ sb);
	sb=sb.reverse();
	sb=sb.delete(4,5);
	System.out.println("delete :"+ sb);
	}
}
