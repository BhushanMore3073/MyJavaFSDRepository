package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDB 
{
	public Connection getConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root",null);
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public void closeConnection(PreparedStatement pst, Connection con)
	{
		try
		{
			pst.close();
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void closeConnection(ResultSet rs, PreparedStatement pst, Connection con)
	{
		try
		{
			rs.close();
			pst.close();
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
