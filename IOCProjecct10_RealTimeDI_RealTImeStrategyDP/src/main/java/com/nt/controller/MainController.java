package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {
	private ICustomerMgmtService service; 
	//To generate constructor ( ALt+shift+S , O)
	public MainController(ICustomerMgmtService service) 
	{ 
		System.out.println("MainController 1-param constructor");
	    this.service = service; 
	}
	
	public String processCustomer(CustomerVO vo) throws Exception 
	{ 
		CustomerDTO dto = new CustomerDTO();
		dto.setCust_Name(vo.getCust_Name());
		dto.setCust_Addrs(vo.getCust_Addrs());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		
		//use service
		String result = service.calculatSimpleInterest(dto);
		return result;
	}
	
	
	

}
