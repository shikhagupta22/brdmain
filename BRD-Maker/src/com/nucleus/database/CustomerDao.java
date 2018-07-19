package com.nucleus.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nucleus.connection.ConnectionFactory;
import com.nucleus.connection.ConnectionI;
import com.nucleus.pojo.Customer;

public class CustomerDao implements CustomerDaoI
{

	ConnectionI c=ConnectionFactory.myConnection("oracle");
    Connection conn=c.getConnection();
   // Customer customer=new Customer();
    @Override
	public int insert(Customer customer) 
	{
    	PreparedStatement ps=null;
    	//ResultSet rs=null;
    	try 
    	{
    		
			ps=conn.prepareStatement("insert into customer_shikha values(seq_id1.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,customer.getCode());
			System.out.println(customer.getCode());
			ps.setString(2,customer.getName());
			ps.setString(3,customer.getAd1());
			ps.setString(4,customer.getCustAd2());
			ps.setString(5,customer.getCustPinCode());
			ps.setString(6,customer.getCustEmail());
			ps.setString(7,customer.getContact());
			ps.setString(8,customer.getCustPrimaryContactPerson());
			ps.setString(9,customer.getCustRecordStatus());
			ps.setString(10,customer.getCustFlag());
			ps.setString(11,customer.getCustCreateDate());
			ps.setString(12,customer.getCustCreatedBy());
			ps.setString(13,customer.getCustModifiedDate());
			ps.setString(14,customer.getCustModifiedBy());
			ps.setString(15,customer.getCustAuthorizedDate());
			ps.setString(16,customer.getCustAuthorizedBy());
			ps.executeUpdate();
			return 1;
		} 
    	catch (SQLException e) 
    	{
			System.out.println("Data does not inserted");
		}
		return 0;
    	
		
		
	}
	@Override
	public boolean validId(String id) 
	{

		try 
		{
			PreparedStatement ps=null;
	        ResultSet rs=null;
			ps=conn.prepareStatement("select * from customer_shikha where customer_code= ?"); 
			ps.setString(1,id);
			rs=ps.executeQuery();
			System.out.println("inside");
			if(rs.next())
			{
				System.out.println("inside1");
				return false;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println("Unique constraint violated");
		}
		return true ;
		
	}
	@Override
	public ArrayList<Customer> viewAll() 
	{
		PreparedStatement ps=null;
        ResultSet rs=null;
		try 
		{
			ArrayList <Customer> cust=new ArrayList<Customer>();
			ps=conn.prepareStatement("select * from customer_shikha");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				Customer customer=new Customer();
			customer.setCode(rs.getString(2));
			System.out.println(customer.getCode());
			customer.setName(rs.getString(3));
			customer.setAd1(rs.getString(4));
			customer.setCustAd2(rs.getString(5));
			customer.setCustPinCode(rs.getString(6));
			customer.setCustEmail(rs.getString(7));
			customer.setContact(rs.getString(8));
			customer.setCustPrimaryContactPerson(rs.getString(9));
			customer.setCustRecordStatus(rs.getString(10));
			customer.setCustFlag(rs.getString(11));
			customer.setCustCreateDate(rs.getString(12));
			customer.setCustCreatedBy(rs.getString(13));
			customer.setCustModifiedDate(rs.getString(14));
			customer.setCustModifiedBy(rs.getString(15));
		    customer.setCustAuthorizedDate(rs.getString(16));
			customer.setCustAuthorizedBy(rs.getString(17));
			cust.add(customer);
            }
			return cust;
		} 
		catch (SQLException e) 
		{
			System.out.println("Data can't be viewed");
		}
		return null; 
		
		
	}
	@Override
	public Customer view(String code) 
	{PreparedStatement ps=null;
    ResultSet rs=null;
	try 
	{
		System.out.println(code);
		ps=conn.prepareStatement("select * from customer_shikha where customer_code=?");
		ps.setString(1,code);
		rs=ps.executeQuery();
		Customer customer=new Customer();
		while(rs.next())
		{
		customer.setCode(rs.getString(2));
		customer.setName(rs.getString(3));
		customer.setAd1(rs.getString(4));
		customer.setCustAd2(rs.getString(5));
		customer.setCustPinCode(rs.getString(6));
		customer.setCustEmail(rs.getString(7));
		customer.setCustEmail(rs.getString(8));
		customer.setCustPrimaryContactPerson(rs.getString(9));
		customer.setCustRecordStatus(rs.getString(10));
		customer.setCustFlag(rs.getString(11));
		customer.setCustCreateDate(rs.getString(12));
		customer.setCustCreatedBy(rs.getString(13));
		customer.setCustModifiedDate(rs.getString(14));
		customer.setCustModifiedBy(rs.getString(15));
	    customer.setCustAuthorizedDate(rs.getString(16));
		customer.setCustAuthorizedBy(rs.getString(17));
		return customer;
		
		}
	} 
	catch (SQLException e) 
	{
		System.out.println("Customer is not valid");
	} 
	return null;
	}
	@Override
	public Customer update(String code) 
	{
		PreparedStatement ps=null;
	    ResultSet rs=null;
		try 
		{
			System.out.println(code);
			ps=conn.prepareStatement("select * from customer_shikha where customer_code=?");
			ps.setString(1,code);
			rs=ps.executeQuery();
			Customer customer=new Customer();
			while(rs.next())
			{
			customer.setCode(rs.getString(2));
			customer.setName(rs.getString(3));
			customer.setAd1(rs.getString(4));
			customer.setCustAd2(rs.getString(5));
			customer.setCustPinCode(rs.getString(6));
			customer.setCustEmail(rs.getString(7));
			customer.setContact(rs.getString(8));
			customer.setCustPrimaryContactPerson(rs.getString(9));
			customer.setCustRecordStatus(rs.getString(10));
			customer.setCustFlag(rs.getString(11));
			customer.setCustCreateDate(rs.getString(12));
			customer.setCustCreatedBy(rs.getString(13));
			customer.setCustModifiedDate(rs.getString(14));
			customer.setCustModifiedBy(rs.getString(15));
		    customer.setCustAuthorizedDate(rs.getString(16));
			customer.setCustAuthorizedBy(rs.getString(17));
			return customer;
			
			}
		} 
		catch (SQLException e) 
		{
			System.out.println("Customer is not valid");
		} 
		return null;
		
		
	}
	@Override
	public int delete(String code) 
	{
		PreparedStatement ps=null;
		try 
		{
			System.out.println(code);
			ps=conn.prepareStatement("delete from customer_shikha where customer_code= ?");
			ps.setString(1,code);
			int exe=ps.executeUpdate();
			System.out.println(exe);
			return exe;
		} 
		catch (SQLException e) 
		{
			System.out.println("Customer is not valid");
		}
		return 0;
		
	}
	@Override
	public int updateDo(Customer customer) 
	{
		PreparedStatement ps=null;
    	try 
    	{
			ps=conn.prepareStatement("update customer_shikha SET customer_id=seq_id1.nextval,customer_name=?,customer_ad1=?,customer_ad2=?,customer_pincode=?,email_id=?,contact_number=?,primary_contact_person=?,record_status=?,flag=?,modified_date=?,modified_by=? where customer_code=?");
			System.out.println(customer.getCode());
			System.out.println(customer.getCode());
			ps.setString(1,customer.getName());
			ps.setString(2,customer.getAd1());
			ps.setString(3,customer.getCustAd2());
			ps.setString(4,customer.getCustPinCode());
			ps.setString(5,customer.getCustEmail());
			ps.setString(6,customer.getContact());
			ps.setString(7,customer.getCustPrimaryContactPerson());
			ps.setString(8,customer.getCustRecordStatus());
			ps.setString(9,customer.getCustFlag());
			ps.setString(10,customer.getCustModifiedDate());
			ps.setString(11,customer.getCustModifiedBy());
			ps.setString(12,customer.getCode());
			ps.executeUpdate();
			return 1;
		} 
    	catch (SQLException e) 
    	{
    		System.out.println("Details are not valid");
		}
		return 0;
    	
		
	}

	}
 


