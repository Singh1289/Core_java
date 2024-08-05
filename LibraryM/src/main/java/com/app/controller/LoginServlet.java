package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.app.dao.LibraryDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/logServ")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		 boolean b;
		 PrintWriter pw = response.getWriter();
		 
		 String user = request.getParameter("username");
		 String pwd = request.getParameter("password");
		 String flag = request.getParameter("choose");
		 System.out.println(flag);
		 
		 if("staff".equals(flag)) {
			 System.out.println("entered..");
			 try {
				b = LibraryDAO.login(user, pwd, flag);
				System.out.println("sevlet= "+b);
				if(b) {
									
					HttpSession session = request.getSession();// creating session
					session.setAttribute("name", user);
					session.setAttribute("pass", pwd);
					System.out.println("successful..");
					RequestDispatcher rd = request.getRequestDispatcher("staff.html");
					rd.forward(request, response);
				} else {
					//Alert a = new Alert();
					pw.write("<script>");
					pw.write("alert('Failed To login.!!!')");
					pw.write("</script>");
					
					RequestDispatcher rd = request.getRequestDispatcher("login.html");
					rd.forward(request, response);
				}
				
			 }catch(Exception e) {
				 e.printStackTrace();
		 		}
		 }else {
			 try {
					b = LibraryDAO.login(user, pwd, flag);
					//System.out.println("sevlet= "+b);
					if(b) {
						HttpSession session = request.getSession();// creating session
						session.setAttribute("name", user);
						session.setAttribute("pass", pwd);
						RequestDispatcher rd = request.getRequestDispatcher("student.html");
						rd.forward(request, response);
					} else {
						pw.write("<script>");
						pw.write("alert('Failed To login!!!')");
						pw.write("</script>");
						RequestDispatcher rd = request.getRequestDispatcher("login.html");
						rd.forward(request, response);
					}
				 }catch(Exception e) {
					 e.printStackTrace();
			 		}
		 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
