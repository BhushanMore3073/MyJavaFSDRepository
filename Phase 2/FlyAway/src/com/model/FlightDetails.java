package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class FlightDetails 
{
	private int Flight_Id;
	private String AirLine_Name;
	private double Ticket_Price;
	private String Flight_Number;
	private String Source_City;
	private String Destination_City;
	private String Departure_time_from_source;
	private String Arrival_time_at_Destination;
	private int Total_Seats;
	private int Booked_Seats;
	private int Seat_Availability;
	private String Date_of_Travel;
	private String clases;
	
	
	public int getFlight_Id() {
		return Flight_Id;
	}
	public void setFlight_Id(int flight_Id) {
		Flight_Id = flight_Id;
	}
	public String getAirLine_Name() {
		return AirLine_Name;
	}
	public void setAirLine_Name(String airLine_Name) {
		AirLine_Name = airLine_Name;
	}
	public double getTicket_Price() {
		return Ticket_Price;
	}
	public void setTicket_Price(double ticket_Price) {
		Ticket_Price = ticket_Price;
	}
	public String getFlight_Number() {
		return Flight_Number;
	}
	public void setFlight_Number(String flight_Number) {
		Flight_Number = flight_Number;
	}
	public String getSource_City() {
		return Source_City;
	}
	public void setSource_City(String source_City) {
		Source_City = source_City;
	}
	public String getDestination_City() {
		return Destination_City;
	}
	public void setDestination_City(String destination_City) {
		Destination_City = destination_City;
	}
	public String getDeparture_time_from_source() {
		return Departure_time_from_source;
	}
	public void setDeparture_time_from_source(String departure_time_from_source) {
		Departure_time_from_source = departure_time_from_source;
	}
	public String getArrival_time_at_Destination() {
		return Arrival_time_at_Destination;
	}
	public void setArrival_time_at_Destination(String arrival_time_at_Destination) {
		Arrival_time_at_Destination = arrival_time_at_Destination;
	}
	public int getTotal_Seats() {
		return Total_Seats;
	}
	public void setTotal_Seats(int total_Seats) {
		Total_Seats = total_Seats;
	}
	public int getBooked_Seats() {
		return Booked_Seats;
	}
	public void setBooked_Seats(int booked_Seats) {
		Booked_Seats = booked_Seats;
	}
	public int getSeat_Availability() {
		return Seat_Availability;
	}
	public void setSeat_Availability(int seat_Availability) {
		Seat_Availability = seat_Availability;
	}
	public String getDate_of_Travel() {
		return Date_of_Travel;
	}
	public void setDate_of_Travel(String date_of_Travel) {
		Date_of_Travel = date_of_Travel;
	}
	
	public String getClases() {
		return clases;
	}
	public void setClases(String clases) {
		this.clases = clases;
	}
	@Override
	public String toString() {
		return "FlightDetails [Flight_Id="+Flight_Id+"AirLine_Name=" + AirLine_Name + ", Ticket_Price=" + Ticket_Price + ", Flight_Number="
				+ Flight_Number + ", Source_City=" + Source_City + ", Destination_City=" + Destination_City
				+ ", Departure_time_from_source=" + Departure_time_from_source + ", Arrival_time_at_Destination="
				+ Arrival_time_at_Destination + ", Total_Seats=" + Total_Seats + ", Booked_Seats=" + Booked_Seats
				+ ", Seat_Availability=" + Seat_Availability + ", Date_of_Travel=" + Date_of_Travel + ", Class=" + clases
				+ "]";
	}
}
