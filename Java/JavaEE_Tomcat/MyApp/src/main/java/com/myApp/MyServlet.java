package com.myApp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("static-access")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//1. Set MIME Type multipurpose internet mail extention
		response.setContentType("text/html");
		
		//2. Get print writer object
		PrintWriter pw = response.getWriter();
		
		//3. Read uname and password from request object
		String uname= request.getParameter("username");
		String pwd = request.getParameter("password");
		String site = "files.html";
		if(uname.equals("admin")&& pwd.equals("admin123")) 
		{
			 //pw.write(alert("Successful"));
			 //response.setStatus(response.SC_ACCEPTED);
	        // response.setHeader("Location", site); 
	         response.sendRedirect(site);
		}else 
		{
			pw.write("login failed ");
			response.sendRedirect("login.html");
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
