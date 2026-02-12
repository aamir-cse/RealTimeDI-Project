package com.nt.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
//We implements serializable to make object transfer over the network.
	
	private String cust_Name;
	private String cust_Addrs;
	private Float pAmt; //Primary amount
	private Float rate;
	private Float time;
	
	//To generate setter and getter (Alt+Shift+S , R)
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
	
	@Override
	public String toString() {
		return "CustomerDTO [cust_Name=" + cust_Name + ", cust_Addrs=" + cust_Addrs + ", pAmt=" + pAmt + ", rate="
				+ rate + ", time=" + time + "]";
	}
}
