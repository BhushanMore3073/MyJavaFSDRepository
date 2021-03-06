package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.model.BookFlight;
import com.model.FlightDetails;
import com.model.User;
import com.utils.MyDB;

public class BookFlightDao 
{
	public int bookFlight(BookFlight bf, int persons)
	{
		int check = 0;
		if(checkSeats(bf.getFlight_Id())>persons)
		{
			String sql = "insert into booking_table(Booking_Id,Flight_Id,User_Id,Total_Seats_Booked_By_User)values(?,?,?,?)";
			Connection con = new MyDB().getConnection();
			PreparedStatement pst = null;
			try
			{
				pst = con.prepareStatement(sql);
				pst.setString(1, bf.getBooking_Id());
				pst.setInt(2, bf.getFlight_Id());
				pst.setInt(3, bf.getUser_Id());
				pst.setInt(4, persons);
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
		}
		return check;
	}
	public Object[] bookFlightReview(int User_Id, int Flight_Id, int persons)
	{
		Object[] obj = new Object[2];
		if(checkSeats(Flight_Id)>persons)
		{
			obj[0] = new UserDao().getUserById(User_Id);
			obj[1] = new FlightDao().getFlightByFlightId(Flight_Id);
		}
		return obj;
	}
	public ArrayList<BookFlight> getBookingHistory(int User_Id)
	{
		String sql= "SELECT * FROM booking_table WHERE User_Id=?";
		Connection con = new MyDB().getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<BookFlight> bflist = new ArrayList<BookFlight>();
		try
		{
			pst = con.prepareStatement(sql);
			pst.setInt(1, User_Id);
			rs = pst.executeQuery();
			while(rs.next())
			{
				//capture user details
				BookFlight bf = new BookFlight();
				bf.setBooking_Id((String)rs.getObject("Booking_Id"));
				bf.setFlight_Id((int)rs.getObject("Flight_Id"));
				bf.setUser_Id((int)rs.getObject("User_Id"));
				bf.setTotal_Seats_Booked((int)rs.getObject("Total_Seats_Booked_By_User"));
				
				bflist.add(bf);
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
		
		return bflist;
	}
	public int checkSeats(int Flight_Id)
	{
		int check = 0;
		Connection con = new MyDB().getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "select Seat_Availability from flightdetail_table where Flight_Id=?";
		try
		{
			pst = con.prepareStatement(sql);
			pst.setInt(1, Flight_Id);
			rs = pst.executeQuery();
			while(rs.next())
			{
				check = (int)rs.getObject("Seat_Availability");
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
}
