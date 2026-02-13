package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public final class  CustomerDAOImpl implements ICustomerDAO {
    private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY = "INSERT INTO REAL_TIME_CUSTOMER VALUES(CUSTID_SEQ.NEXTVAL,?,?,?,?,?,?)";
	private DataSource ds;
	//To generate constructor ( ALt+shift+S , O)
	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl 1-param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count=0;
		try {
			//Get pooled JDBC connection object
			con = ds.getConnection();
			//created preparedStatement object having pre-compiled SQL query
			ps = con.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY);
			ps.setString(1, bo.getCust_Name());
			ps.setString(2, bo.getCust_Addrs());
			ps.setFloat(3, bo.getpAmt());
			ps.setFloat(5, bo.getRate());
			ps.setFloat(4, bo.getTime());
			ps.setFloat(6, bo.getInterest_Amount());
			//Execute the query
			 count = ps.executeUpdate();
		}catch(SQLException se)
		{
			se.printStackTrace();
			throw se; //Throwing the same exection for tracking the exception in any layer.
		}catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			//Note : exception may raised inside finally block.
			//Close jdbc connection object
			try {
				if(ps != null)
				{
					ps.close();
				}
			}catch(SQLException se)
			{
				se.printStackTrace();
				throw se;
			}
			
			try {
				if(con != null)
				{
					con.close();
				}
			}catch(SQLException se)
			{
				se.printStackTrace();
				throw se;
			}
		}
		return count;
	}

}
