package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.model.Student;

public class StudentDAO {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found..");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","@Singh1289");
		System.out.println("Connection Established");	
		return con;
	}
	
	public static Student search( long a) throws ClassNotFoundException, SQLException {
		Connection con= getConnection();
		PreparedStatement ps = con.prepareStatement("select PRN,student_Name,internal,MCQ,practical from result where PRN = ?;");
		ps.setLong(1, a);
//		PreparedStatement ps = con.prepareStatement("select * from result;");
		Student s= new Student();
		ResultSet rs = ps.executeQuery();
//		System.out.println("check DAO result set: "+rs.next());
//		return rs;
		if(rs.next()) {
			
			s.setPRN(rs.getLong(1));
			s.setStudent_Name(rs.getString(2));
			s.setInternal(rs.getInt(3));
			s.setMCQ(rs.getInt(4));
			s.setPractical(rs.getInt(5));
			//System.out.println(s);
			return s;
		}else {return s;}
		
	}
	
}
