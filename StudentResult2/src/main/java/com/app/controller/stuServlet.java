package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.app.dao.StudentDAO;
import com.app.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class stuServlet
 */
public class stuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		long prn = Long.parseLong(request.getParameter("prn"));
		try {
			Student s = StudentDAO.search(prn);
			
			if(s.getStudent_Name()!=null) {
			pw.write("<h3><a href='student.html'>Go Back</a></h3><br><hr><br>");	
			pw.write("PRN        : "+s.getPRN()+
					 "<br>Name       : "+s.getStudent_Name()+
					 "<br>Internal   : "+s.getInternal()+
					 "<br>MCQ        : "+s.getMCQ()+
					 "<br>Practical  : "+s.getPractical());
			
			pw.write("<br>Total      : "+(s.getInternal()+s.getMCQ()+s.getPractical()));
			pw.write("<br>Percentage : "+((s.getInternal()+s.getMCQ()+s.getPractical())*0.769)+"%");
		}else {
			pw.write("<script>");
			pw.write("alert('PRN is not Available please check again !!!')");
			pw.write("</script>");
		    request.getRequestDispatcher("student.html");
			
		}
			//response.sendRedirect("student.html").include(request,response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
