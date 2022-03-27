package com.model;

import javax.persistence.OneToMany;

public class BookFlight 
{
	private int User_Id;
	private int Flight_Id;
	private String Booking_Id;
	private int Total_Seats_Booked;
	
	
	public int getTotal_Seats_Booked() {
		return Total_Seats_Booked;
	}
	public void setTotal_Seats_Booked(int total_Seats_Booked) {
		Total_Seats_Booked = total_Seats_Booked;
	}
	public int getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}
	public int getFlight_Id() {
		return Flight_Id;
	}
	public void setFlight_Id(int flight_Id) {
		Flight_Id = flight_Id;
	}
	public String getBooking_Id() {
		return Booking_Id;
	}
	public void setBooking_Id(String booking_Id) {
		Booking_Id = booking_Id;
	}
	@Override
	public String toString() {
		return "UserTravelHistory [Total_Seats_Booked="+Total_Seats_Booked+", User_Id=" + User_Id + ", Flight_Id=" + Flight_Id + ", Booking_Id=" + Booking_Id
				+ "]";
	}
	
	
}
