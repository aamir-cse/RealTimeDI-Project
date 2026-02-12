package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Customer Name::");
      String name = sc.next();
      System.out.println("Enter Customer Address::");
      String addrs = sc.next();
      System.out.println("Enter Principal Amount::");
      String pAmt = sc.next();
      System.out.println("Enter Time::");
      String time = sc.next();
      System.out.println("Enter Rate::");
      String rate = sc.next();
      
      //Create CustomerVO class object having UI data
      CustomerVO vo = new CustomerVO();	
      vo.setCust_Name(name);
      vo.setCust_Addrs(addrs);
      vo.setpAmt(pAmt);
      vo.setTime(time);
      vo.setRate(rate);
      
      //Create IOC container (ApplicationContext container)
      	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
      	//Load Bean class file to IOC
      	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
      	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
      	//Get Controller class object from IOC container
      	MainController controller = factory.getBean("controller", MainController.class);
      	//Invoke method
      	try {
      		String result = controller.processCustomer(vo);
      		System.out.println(result);
      	}
      	catch(Exception e)
	  	{
	  		e.printStackTrace();
	  		System.out.println("Internal Problem:: Try again"+e.getMessage());
	  	}
	  	sc.close();
      
	}

}
