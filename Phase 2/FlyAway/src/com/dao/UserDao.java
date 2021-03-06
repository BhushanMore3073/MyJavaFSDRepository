package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.model.BookFlight;
import com.model.FlightDetails;
import com.model.User;
import com.utils.MyDB;

public class UserDao 
{

	public int registerUser(User u)
	{
		int check = 0;
		Connection con = new MyDB().getConnection();
		PreparedStatement pst = null;
		String sql = "insert into registerdetail_table(Username,Password,Full_Name,Age,Email,Aadhar,Country)values(?,?,?,?,?,?,?)";
		try
		{
			pst = con.prepareStatement(sql);
			pst.setString(1, u.getUsername());
			pst.setString(2, u.getUserPassword());
			pst.setString(3, u.getUserFullName());
			pst.setInt(4, u.getAge());
			pst.setString(5, u.getUserEmail());
			pst.setString(6, u.getUserAadhar());
			pst.setString(7, u.getCountry());
			
			check = pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			new MyDB().closeConnection(pst, con);
		}
		if(check>0)
		{
			updateLoginInfo(u);
		}
		return check;
	}
	public ArrayList<FlightDetails> searchFlight(String Source_City, String Destination_City, String Date_of_Travel)
	{
		ArrayList<FlightDetails> flist = new ArrayList<FlightDetails>();
		Connection con = new MyDB().getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		DateFormat Tformt = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		String sql = "select * from flightdetail_table where Source_City=? and Destination_City=? and Date_of_Travel=?";
		try
		{
			pst = con.prepareStatement(sql);
			pst.setString(1, Source_City);
			pst.setString(2, Destination_City);
			try {
				pst.setString(3, format.format(Tformt.parse(Date_of_Travel)));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			rs = pst.executeQuery();
			while(rs.next())
			{
				FlightDetails fd = new FlightDetails();
				fd.setFlight_Id((int)rs.getObject("Flight_Id"));
				fd.setAirLine_Name((String)rs.getObject("AirLine_Name"));
				fd.setFlight_Number((String)rs.getObject("Flight_Number"));
				fd.setSource_City((String)rs.getObject("Source_City"));
				fd.setDestination_City((String)rs.getObject("Destination_City"));
				fd.setDeparture_time_from_source(rs.getObject("Departure_time_from_source").toString());
				fd.setArrival_time_at_Destination(rs.getObject("Arrival_time_at_destination").toString());
				fd.setDate_of_Travel(rs.getObject("Date_of_Travel").toString());
				fd.setTotal_Seats((int)rs.getObject("Total_Seats"));
				fd.setBooked_Seats((int)rs.getObject("Booked_Seats"));
				fd.setSeat_Availability((int)rs.getObject("Seat_Availability"));
				fd.setTicket_Price((double)rs.getObject("Ticket_Price"));
				fd.setClases((String)rs.getObject("Class"));
				
				flist.add(fd);
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
		return flist;
	}
	public int checkUserLogin(String username,String password)
	{
		int check = 0;
		Connection con = new MyDB().getConnection();
		PreparedStatement pst = null;
		String sql = "select * from login_table where Username=?";
		ResultSet rs = null;
		
		try
		{
			pst = con.prepareStatement(sql);
			pst.setString(1, username);
			rs = pst.executeQuery();
			while(rs.next())
			{
				String user = (String)rs.getObject("Username");
				String pass = (String)rs.getObject("password");
				int uid = (int)rs.getObject("User_Id");
				
				if(pass.equals(password))
					check = uid;
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
		
		return check;
	}
	private void updateLoginInfo(User u)
	{
		String sql2 = "INSERT INTO `login_table` (`Username`, `password`, `User_Id`) VALUES (?, ?, ?)";
		Connection con = new MyDB().getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "select User_Id from registerdetail_table where Username=?";
		try
		{
			pst = con.prepareStatement(sql);
			pst.setString(1, u.getUsername());
			rs = pst.executeQuery();
			while(rs.next())
				u.setUserId((int)rs.getObject("User_Id"));
			
			pst = con.prepareStatement(sql2);
			pst.setString(1, u.getUsername());
			pst.setString(2, u.getUserPassword());
			pst.setInt(3, u.getUserId());
			pst.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			new MyDB().closeConnection(rs,pst,con);
		}
	}
	public User getUserById(int id)
	{
		String sql = "select * from registerdetail_table where User_Id=?";
		User u = null;
		Connection con = new MyDB().getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try
		{
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while(rs.next())
			{
				u = new User();
				u.setAge((int)rs.getObject("Age"));
				u.setCountry((String)rs.getObject("Country"));
				u.setUserAadhar((String)rs.getObject("Aadhar"));
				u.setUserEmail((String)rs.getObject("Email"));
				u.setUserFullName((String)rs.getObject("Full_Name"));
				u.setUserId((int)rs.getObject("User_Id"));
				u.setUsername((String)rs.getObject("Username"));
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
		return u;
	}
}
