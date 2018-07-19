package com.nucleus.connection;

public class ConnectionFactory 
{
	public static ConnectionI myConnection(String str)
	{
		if(str.equalsIgnoreCase("oracle"))
		{
			return new OracleConnection();
		}
		else if(str.equalsIgnoreCase("MySql"))
		{
			return new MySqlConnection();
		}
		return null;
	}

}
