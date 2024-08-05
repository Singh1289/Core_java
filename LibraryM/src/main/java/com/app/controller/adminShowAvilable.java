package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.dao.LibraryDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/adminShowAvilable")
public class adminShowAvilable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public adminShowAvilable() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		HttpSession hs = request.getSession(false);
		if(hs!=null) {
			try {
				ResultSet s= LibraryDAO.showAvailable();
				pw.write("ID               Book Name                Author");
				while(s.next()) {
					pw.write(s.getInt(1)+"  "+s.getString(2)+"  "+s.getString(3));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
