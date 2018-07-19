package com.nucleus.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.nucleus.connection.ConnectionFactory;
import com.nucleus.connection.ConnectionI;

public class UserDao implements UserDaoI
{
	
	public int login(String name,String pass)
	{
		ConnectionI c=ConnectionFactory.myConnection("oracle");
        Connection conn=c.getConnection();
		try 
		{
			
	        PreparedStatement ps=null;
	        ResultSet rs=null;
			ps=conn.prepareStatement("select * from validate_shikha where name=?"); 
			ps.setString(1,name);
			rs=ps.executeQuery();
			while(rs.next())
			{
			String password=rs.getString("pass");
			String role=rs.getString("role_id");
			System.out.println(role);
			if(pass.equals(password))
			{
				if(role.equals("101"))
				{
				System.out.println("User is maker");
				return 1;
				}
				else if(role.equals("102"))
				{
					System.out.println("User is checker");
					return 2;
					
				}
			}
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				conn.close();
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
		
	}

}
