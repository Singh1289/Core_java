import java.sql.*;
import java.util.Scanner;

public class SqlFirst {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","@Singh1289");
		System.out.println("Connection Established");
		
		PreparedStatement ps= c.prepareStatement("insert into employee value (?,?,?)");
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Employee Id =");
    	int id = s.nextInt();
       	System.out.print("Enter Employee Name =");
    	String name = s.next();
       	System.out.print("Enter Employee Salary =");
    	float salary = s.nextFloat();
    	
    	ps.setInt(1, id);
    	ps.setString(2, name);
    	ps.setFloat(3, salary);
    	
    	int set = ps.executeUpdate();
    	System.out.println(set);
    	
    	ResultSet rs = ps.executeQuery("select * from employee");
    	while(rs.next()) {
    		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));		
    	}
    	c.close();
	}
}
