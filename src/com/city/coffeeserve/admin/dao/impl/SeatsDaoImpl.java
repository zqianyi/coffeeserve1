package com.city.coffeeserve.admin.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.city.coffeeserve.admin.ConnectionFactory.ConnectionFactory;
import com.city.coffeeserve.admin.dao.ISeatsDao;
import com.city.coffeeserve.note.value.SeatsValue;
import com.city.coffeeserve.note.value.waitersvalue;

public class SeatsDaoImpl implements ISeatsDao{
	public SeatsValue getseat(String sid)throws Exception{
		int i=0;
		SeatsValue sv=new SeatsValue();
		String sql="select sfree from seat where sid  like '%"+sid+"%'";
		Connection cn=null;

			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			

			ResultSet rs=ps.executeQuery();	
		    
			while(rs.next()){
			
				
				sv.setSid(Integer.parseInt(rs.getString("sid")));
				sv.setSfree(rs.getString("sfree"));
			     
			}
			rs.close();
			cn.close();
			System.out.println("okkkkk");
			return sv;
	
}
}
