package com.model;

public class Product 
{
	private int pid;
	private String pname;
	private String pdescription;
	private double pprice;
	
	public void setPid(int pid) {this.pid = pid;}
	public void setPname(String pname) {this.pname = pname;}
	public void setPdescription(String pdescription) {this.pdescription = pdescription;}
	public void setPprice(double pprice) {this.pprice= pprice;}
	
	public int getPid() {return pid;}
	public String getPname() {return pname;}
	public String  getPdescription() {return pdescription;}
	public double getPprice() {return pprice;}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdescription=" + pdescription + ", pprice=" + pprice
				+ "]";
	}
	
	
}
