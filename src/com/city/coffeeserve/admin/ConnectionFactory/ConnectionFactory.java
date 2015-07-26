package com.city.coffeeserve.admin.ConnectionFactory;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionFactory {
	
	public static Connection getConnection() throws Exception{
	Context ctx=new InitialContext(); 
	 DataSource ds=(DataSource) ctx.lookup("java:comp/env/cityoa");
	 Connection cn=ds.getConnection();
	 return cn;
	 }

}
