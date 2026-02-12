package com.nt.bo;

public class CustomerBO {
	//Bean properties
	private String cust_Name;
	private String cust_Addrs;
	private Float pAmt; //Primary amount
	private Float rate;
	private Float time;
	private Float interest_Amount;
	
	//To generate getter and setter ( Alt+shift+S , r) 
	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	public String getCust_Addrs() {
		return cust_Addrs;
	}
	public void setCust_Addrs(String cust_Addrs) {
		this.cust_Addrs = cust_Addrs;
	}
	public Float getpAmt() {
		return pAmt;
	}
	public void setpAmt(Float pAmt) {
		this.pAmt = pAmt;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	public Float getInterest_Amount() {
		return interest_Amount;
	}
	public void setInterest_Amount(Float interest_Amount) {
		this.interest_Amount = interest_Amount;
	}
	
	//To generate toString method : ( Alt+Shift+S , S)
	@Override
	public String toString() {
		return "CustomerBO [cust_Name=" + cust_Name + ", cust_Addrs=" + cust_Addrs + ", pAmt=" + pAmt + ", rate=" + rate
				+ ", time=" + time + ", interest_Amount=" + interest_Amount + "]";
	}
	
	
	
	

}
