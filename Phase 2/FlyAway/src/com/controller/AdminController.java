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

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("adminLogin").equals("Login"))
		{
			Connection con = new MyDB().getConnection();
			PreparedStatement pst = null;
			ResultSet rs = null;
			String admin = null;
			String sql = "select admin_username from admin_login where admin_username=? and admin_password=?";
			try
			{
				pst = con.prepareStatement(sql);
				pst.setString(1, request.getParameter("admin_username"));
				pst.setString(2, request.getParameter("admin_password"));
				rs = pst.executeQuery();
				//admin = (String)rs.getObject("admin_username");
				while(rs.next())
				{
					admin = (String)rs.getObject("admin_username");
				}
				if(admin!=null)
				{
					request.setAttribute("admin", admin);
					request.getRequestDispatcher("AdminActivity.jsp").forward(request, response);
				}
				else
				{
					response.getWriter().println("Check your Username And Password Again !");
					request.getRequestDispatcher("login.jsp").include(request, response);
				}
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				new MyDB().closeConnection(rs, pst, con);
			}
		}
		if(request.getParameter("adminLogin").equals("logout"))
		{
			request.getRequestDispatcher("logout.jsp").forward(request, response);
		}
		if(request.getParameter("adminLogin").equals("Forgot"))
		{
			Connection con = new MyDB().getConnection();
			PreparedStatement pst = null;
			ResultSet rs = null;
			String admin = request.getParameter("admin_username"), msg="";
			String sql = "update admin_login set admin_password=? where admin_username=?";
			try
			{
				pst = con.prepareStatement(sql);
				String p1=request.getParameter("admin_password"), p2 = request.getParameter("admin_confirm_password");
				if(p1.equals(p2))
					pst.setString(1, p1);
				pst.setString(2, request.getParameter("admin_username"));
				int n = pst.executeUpdate();
				//admin = (String)rs.getObject("admin_username");
				
				if(n>0)
				{
					request.getRequestDispatcher("index.html").forward(request, response);
				}
				else
				{
					response.getWriter().println("Check your Username And Password Again !");
					request.getRequestDispatcher("login.jsp").include(request, response);
				}
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				new MyDB().closeConnection(pst, con);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
