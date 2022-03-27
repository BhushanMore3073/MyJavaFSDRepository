package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utils.MyDB;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("b1").equals("Display"))
		{
			Connection con = new MyDB().getConnection();
			PreparedStatement pst = null;
			ResultSet rs = null;
			String sql= "select pid,pname,pdescription,pprice from products where pid=?";
			
			try
			{
				pst = con.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(request.getParameter("pid")));
				rs = pst.executeQuery();
				response.getWriter().println("<h1>Products : </h1><br><br>");
				while(rs.next())
				{
					response.getWriter().println("Proudct ID : "+rs.getObject("pid")+"<br>");
					response.getWriter().println("Proudct Name : "+rs.getObject("pname")+"<br>");
					response.getWriter().println("Proudct Description : "+rs.getObject("pdescription")+"<br>");
					response.getWriter().println("Proudct Price : "+rs.getObject("pprice")+"<br>");
					response.getWriter().println("<br><br>");
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				new MyDB().closeConnection(rs, pst, con);
			}
		}
	}

}
