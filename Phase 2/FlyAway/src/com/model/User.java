package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private int Age;
	private String userFullName;
	private String userEmail;
	private String userPassword;
	private String username;
	private String Country;
	private String userAadhar;
	
	
	
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String Country) {
		this.Country = Country;
	}
	public String getUserAadhar() {
		return userAadhar;
	}
	public void setUserAadhar(String userAadhar) {
		this.userAadhar = userAadhar;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", Age=" + Age + ", userFullName=" + userFullName + ", userEmail=" + userEmail
				+ ", userPassword=" + userPassword + ", username=" + username + ", Country=" + Country + ", userAadhar="
				+ userAadhar + "]";
	}
	
}