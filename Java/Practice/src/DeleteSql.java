import java.sql.*;
import java.util.Scanner;

public class DeleteSql {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","@Singh1289");
		System.out.println("Connection Established");
		
		PreparedStatement ps= c.prepareStatement("delete from employee where id= (?)");
		
		Scanner s = new Scanner(System.in);
		System.out.print("Employee Id to delete =");
    	int id = s.nextInt();
       

    	ps.setInt(1, id);
  
    	int set = ps.executeUpdate();
    	System.out.println(set);
    	
    	ResultSet rs = ps.executeQuery("select * from employee");
    	while(rs.next()) {
    		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));		
    	}
    	c.close();
	}
}
