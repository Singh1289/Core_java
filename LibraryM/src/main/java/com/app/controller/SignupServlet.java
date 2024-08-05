package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.app.dao.LibraryDAO;
import com.app.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/signServ")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SignupServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html");
		 PrintWriter pw = response.getWriter();
		int b;
		 String name = request.getParameter("fname");
		 String email = request.getParameter("email");
		 String user = request.getParameter("username");
		 String pwd = request.getParameter("password");
		 String gender = request.getParameter("gender");
		 String mobile = request.getParameter("mobile");
		 
		 long mob = Long.parseLong(mobile);
		 Student s = new Student(name, user, email, pwd, gender, mob);
		 
		 try {
			b= LibraryDAO.register(s);
			if(b==1) {			
				//alert successful..
				pw.write("<script>");
				pw.write("alert('SuccessFull!!!')");
				pw.write("</script>");
				request.getRequestDispatcher("login.html").include(request, response);}
			else {throw new Exception();}
		 }catch (Exception e) {
			//alert  
			 	pw.write("<script>");
				pw.write("alert('Failed To Registered!!!')");
				pw.write("</script>");
			request.getRequestDispatcher("signup.html").include(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
