package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.model.FlightDetails;
import com.utils.MyDB;

public class FlightDao 
{
	public int addFlight(FlightDetails fd)
	{
		int check = 0;
		Connection con = new MyDB().getConnection();
		PreparedStatement pst = null;
		String sql = "insert into flightdetail_table("
				+ "Airline_Name," //1
				+ "Ticket_Price,"  //2
				+ "Flight_Number," //3
				+ "Source_City,"  //4
				+ "Destination_City," //5
				+ "Departure_time_from_source," //6
				+ "Arrival_time_at_Destination," //7
				+ "Total_Seats," //8
				+ "Booked_Seats," //9
				+ "Seat_Availability," //10
				+ "Date_of_Travel," //11
				+ "Class"+")" //12
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try
		{
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			DateFormat formt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
			DateFormat Tformt = new SimpleDateFormat("yyyy-MM-dd");
			Date Ddate = null,ADate = null,TDate = null;
			try {
				ADate = formt.parse(fd.getArrival_time_at_Destination());
				Ddate = formt.parse(fd.getDeparture_time_from_source());
				TDate = Tformt.parse(fd.getDate_of_Travel());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pst = con.prepareStatement(sql);
			pst.setString(1, fd.getAirLine_Name());
			pst.setDouble(2, fd.getTicket_Price());
			pst.setString(3, fd.getFlight_Number());
			pst.setString(4, fd.getSource_City());
			pst.setString(5, fd.getDestination_City());
			pst.setString(6, format.format(Ddate));
			pst.setString(7, format.format(ADate));
			pst.setInt(8, fd.getTotal_Seats());
			pst.setInt(9, fd.getBooked_Seats());
			pst.setInt(10, fd.getSeat_Availability());
			pst.setString(11, format.format(TDate));
			pst.setString(12, fd.getClases());
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
		
		return check;
	}
	public ArrayList<FlightDetails> displayAllFlight()
	{
		String sql = "select * from flightdetail_table";
		Connection con = new MyDB().getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<FlightDetails> flist = new ArrayList<>();
		try
		{
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next())
			{
				FlightDetails fd = new FlightDetails();
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
	public FlightDetails displayFlightByFlightNumber(String FlightNumber)
	{
		String sql = "select * from flightdetail_table where Flight_Number=?";
		Connection con = new MyDB().getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		FlightDetails fd = null;
		try
		{
			pst = con.prepareStatement(sql);
			pst.setString(1, FlightNumber);
			rs = pst.executeQuery();
			while(rs.next())
			{
				fd = new FlightDetails();
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
		return fd;
	}
	public FlightDetails getFlightByFlightId(int Flight_Id)
	{
		String sql = "select * from flightdetail_table where Flight_Id=?";
		Connection con = new MyDB().getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		FlightDetails fd = null;
		try
		{
			pst = con.prepareStatement(sql);
			pst.setInt(1, Flight_Id);
			rs = pst.executeQuery();
			while(rs.next())
			{
				fd = new FlightDetails();
				fd.setFlight_Id(Flight_Id);
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
		return fd;
	}
	public int updateSeats(int seats, int Flight_Id)
	{
		int check = 0,check1 = 0;
		FlightDetails fd = getFlightByFlightId(Flight_Id);
		String sql= "UPDATE flightdetail_table SET Seat_Availability=? WHERE Flight_Id=?";
		String sql2 = "UPDATE flightdetail_table SET Booked_Seats=? WHERE Flight_Id=?";
		
		int total_seats = fd.getTotal_Seats();
		int available_seats = fd.getSeat_Availability();
		int total_booked_seats = (total_seats-available_seats)+seats;
		available_seats = available_seats-seats;
		
		Connection con1 = new MyDB().getConnection();
		Connection con2 = new MyDB().getConnection();
		PreparedStatement pst1= null,pst2 = null;
		try
		{
			pst1 = con1.prepareStatement(sql);
			pst1.setInt(1, available_seats);
			pst1.setInt(2, fd.getFlight_Id());
			check = pst1.executeUpdate();
			
			pst2 = con2.prepareStatement(sql2);
			pst2.setInt(1, total_booked_seats);
			pst2.setInt(2, Flight_Id);
			check1 = pst2.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			new MyDB().closeConnection(pst1, con1);
			new MyDB().closeConnection(pst2, con2);
		}
		return check;
	}
}
