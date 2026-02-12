package com.nt.vo;

public class CustomerVO {
	//VO maintain all its property as String properties.
	private String cust_Name;
	private String cust_Addrs;
	private String pAmt; //Primary amount
	private String rate;
	private String time;
	
	//Getter and setter
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
	public String getpAmt() {
		return pAmt;
	}
	public void setpAmt(String pAmt) {
		this.pAmt = pAmt;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "CustomerVO [cust_Name=" + cust_Name + ", cust_Addrs=" + cust_Addrs + ", pAmt=" + pAmt + ", rate=" + rate
				+ ", time=" + time + "]";
	}

}
