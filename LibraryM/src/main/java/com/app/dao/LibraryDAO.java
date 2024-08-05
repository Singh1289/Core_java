package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.app.model.Student;

public class LibraryDAO {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found..");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","@Singh1289");
		System.out.println("Connection Established");	
		return con;
	}
	
	public static boolean login( String user, String pass, String flag) throws ClassNotFoundException, SQLException {
		Connection con= getConnection();
		if("staff".equals(flag)) {
			PreparedStatement st = con.prepareStatement("select * from staff_login where username = ? and password = ?;");
			st.setString(1, user);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			boolean check = rs.next();
			System.out.println("DAO= "+check);
			return check;
		}else {
			PreparedStatement st = con.prepareStatement("select * from studentlogin where username = ? and password = ?;");
			st.setString(1, user);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			boolean check = rs.next();
			System.out.println("DAO else= "+check);
			return check;
		}
	}
	
	public static int register(Student s) throws ClassNotFoundException, SQLException {
		System.out.println("entered...!");
		Connection con = getConnection();
		System.out.println("connection...done");
		PreparedStatement st = con.prepareStatement("insert into studentlogin(fname,username,email,password,gender,mobile) values (?,?,?,?,?,?);");
		st.setString(1, s.getFname());
		st.setString(2, s.getUsername());
		st.setString(3, s.getEmail());
		st.setString(4, s.getPassword());
		st.setString(5, s.getGender());
		st.setLong(6, s.getMobile());
		System.out.println(s.toString());
		
		int check = st.executeUpdate();
		System.out.println("DAO reg= "+check);
		return check;
	}
	
	public static ResultSet showAvailable() throws ClassNotFoundException, SQLException {
		ResultSet rs= null;
		System.out.println("entered...!");
		Connection con = getConnection();
		System.out.println("connection...done");
		PreparedStatement st = con.prepareStatement("select * from library where active = 1;");
		
		rs= st.executeQuery();
		
		
		System.out.println("returning set : ");
		return rs;
	}
	
	public static ResultSet showStudetBook(String s) throws ClassNotFoundException, SQLException {
		ResultSet rs= null;
		System.out.println("entered...!");
		Connection con = getConnection();
		System.out.println("connection...done");
		
		PreparedStatement st = con.prepareStatement("select * from library where stu_name= ? ;");
		st.setString(1, s);
		rs= st.executeQuery();
		
		System.out.println("returning set : ");
		return rs;
	}
	
	public static ResultSet showIssuedAdmin() throws ClassNotFoundException, SQLException {
		ResultSet rs= null;
		System.out.println("entered...!");
		Connection con = getConnection();
		System.out.println("connection...done");
		PreparedStatement st = con.prepareStatement("select * from library where active = 0;");
		rs= st.executeQuery();
		System.out.println("returning set : ");
		return rs;
	}
	
	public static int issueBook (int a,String s) throws ClassNotFoundException, SQLException {
		System.out.println("entered...!");
		Connection con = getConnection();
		System.out.println("connection...done");
		PreparedStatement st = con.prepareStatement("update library set active = 0, stu_name= ? where id = ?; ;");
		st.setString(1, s);
		st.setInt(2, a);
		
		int check = st.executeUpdate();
		System.out.println("DAO issue= "+check);
		return check;
	}
	
	public static int depositeBook (int a) throws ClassNotFoundException, SQLException {
		System.out.println("entered...!");
		Connection con = getConnection();
		System.out.println("connection...done");
		PreparedStatement st = con.prepareStatement("update library set active = 1, stu_name= null where id = ?; ;");
	
		st.setInt(1, a);
		int check = st.executeUpdate();
		System.out.println("DAO deposite= "+check);
		return check;
	}
	
}
