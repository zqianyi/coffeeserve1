package com.city.coffeeserve.admin.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.city.coffeeserve.admin.ConnectionFactory.ConnectionFactory;
import com.city.coffeeserve.admin.dao.ISeatbillsDao;
import com.city.coffeeserve.note.value.SeatbillsValue;

public class seatbillsDaoImpl implements ISeatbillsDao{
	public void createSeatbill(SeatbillsValue sv)throws Exception{
		String sql="insert into seatbill(sbid,sbwaiter,sbprice,sbtime) values (?,?,?,?)";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setInt(1,sv.getSbid());
			ps.setString(2,sv.getSbwaiter());
			ps.setString(3,sv.getSbprice());
			ps.setString(4,sv.getSbtime());
			ps.executeUpdate();
				
				
				
			ps.close();
		}catch(Exception e){e.getMessage();}finally{cn.close();}
	}
	public SeatbillsValue getSeatbillValue(int i)throws Exception{
		String sql="select sbid,sbwaiter,sbprice,sbtime from seatbill  where sbid=i";
		Connection cn=null;
		SeatbillsValue sv=new SeatbillsValue();

		try{
			cn=ConnectionFactory.getConnection();
		
			PreparedStatement ps=cn.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();	
		
			while(rs.next()){
			
				
				sv.setSbid(Integer.parseInt(rs.getString("sbid")));
				sv.setSbwaiter(rs.getString("sbwaiter"));
				sv.setSbprice(rs.getString("sbprice"));
				sv.setSbtime(rs.getString("sbtime"));
				
			}
			rs.close();
			cn.close();
			
		}catch(Exception e){e.getMessage();}	
		return sv;	
		
	}
	
}
