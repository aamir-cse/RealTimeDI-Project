package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	private ICustomerDAO dao;
	//To generate constructor ( ALt+shift+S , O)
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl 1-param constructor");
		this.dao = dao;
	}

	@Override
	public String calculatSimpleInterest(CustomerDTO dto) throws Exception {
		float interestAmount=0.0f;
		int count=0;
		//Calculate simple interest amount (Business logic)
		interestAmount=(dto.getpAmt()*dto.getRate()*dto.getTime())/100.0f;
		//Prepare BO class object having persistable data
		CustomerBO bo=new CustomerBO();
		bo.setCust_Name(dto.getCust_Name());
		bo.setCust_Addrs(dto.getCust_Addrs());
		bo.setpAmt(dto.getpAmt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setInterest_Amount(interestAmount);
		
		 //Use DAO
		 count=dao.insert(bo);
		 if(count==0)
			 return "Customer Registration Failed";
		 else
			 return "Customer Registration Succeded :: Interest Amount::"+interestAmount;

	

}
}
	