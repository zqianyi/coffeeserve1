package com.city.coffeeserve.admin.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.city.coffeeserve.admin.ConnectionFactory.ConnectionFactory;
import com.city.coffeeserve.admin.dao.IWaitersDao;
import com.city.coffeeserve.note.value.FoodValue;
import com.city.coffeeserve.note.value.waitersvalue;

public class WaitersDaoImpl implements IWaitersDao {
	
	public void createWaiter(waitersvalue wv)throws Exception
	{
		String sql="insert into waiters(wid,wname,wpassword,wsex,wphone) values (?,?,?,?,?)";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setInt(1,wv.getWid());
			ps.setString(2,wv.getWname());
			ps.setString(3,wv.getWpassword());
			ps.setString(4,wv.getWsex());
			ps.setString(5,wv.getWphone());
			ps.executeUpdate();
				
				
				
			ps.close();
		}catch(Exception e){e.getMessage();}finally{cn.close();}
	}
	public boolean findWaiter(String wname,String wpassword)throws Exception{
		String sql ="select * from waiters where wname = ? and wpassword = ?";
		Connection cn=null;

			cn=ConnectionFactory.getConnection();
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, wname);
			ps.setString(2, wpassword);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				return true;
			
			}else{
				return  false;
			}
	
	}
	public waitersvalue selectWaiter(String wname,String wpassword)throws Exception{
	    waitersvalue wv=new waitersvalue();
		String sql ="select * from waiters where wname = ? and wpassword = ?";
		
		Connection cn=null; 

			cn=ConnectionFactory.getConnection();
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(2, wname);
			ps.setString(3, wpassword);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				wv.setWname(rs.getString(wname));
				wv.setWpassword(rs.getString(wpassword));
			return wv;
				
			
			}else{
				return null;
			}
	}
	public List getwaitersValueBySearch()throws Exception{
		List wList =new ArrayList();
		String sql="select *from waiters";
		Connection cn=null;

			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			

			ResultSet rs=ps.executeQuery();	
		
			while(rs.next()){
			
				waitersvalue wv=new waitersvalue();
				wv.setWid(Integer.parseInt(rs.getString("wid")));
				wv.setWname(rs.getString("wname"));
				wv.setWpassword(rs.getString("wpassword"));
				wv.setWsex(rs.getString("wsex"));
				wv.setWphone(rs.getString("wphone"));
				
				wList.add(wv);
				
			
		
			}
			rs.close();
			cn.close();
			return wList;
	
}
	public void deletewaiter(String id) throws Exception{
		String sql="delete from waiters where wid=?";
		System.out.println("okkkkkkkkkkkkkk");
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, id);
		ps.executeUpdate();
		System.out.println("ok");
		ps.close();
		cn.close();
	}
	public void update(waitersvalue wv) throws Exception{
		String sql="update waiters set wname=?,wpassword=?,wsex=?,wphone=? where wid=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		
		ps.setInt(1, wv.getWid());
		ps.setString(2, wv.getWname());
		ps.setString(3, wv.getWpassword());
		ps.setString(4, wv.getWsex());
		ps.setString(5, wv.getWphone());
		ps.executeUpdate();
		ps.close();
		cn.close();
		
		
	}
}
