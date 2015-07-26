package com.city.coffeeserve.admin.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.city.coffeeserve.admin.ConnectionFactory.ConnectionFactory;
import com.city.coffeeserve.admin.dao.IFooddao;
import com.city.coffeeserve.note.value.FoodValue;




public class FoodDaoImpl implements IFooddao{
	public void createFood(FoodValue fv)throws Exception
	{
		String sql="insert into food(fid,fname,ftype,fprice,fshock) values (?,?,?,?,?)";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setInt(1,fv.getFid());
			ps.setString(2,fv.getFname());
			ps.setString(3,fv.getFtype());
			ps.setString(4,fv.getFprice());
			ps.setString(5,fv.getFshock());
			ps.executeUpdate();
				
				
				
			ps.close();
		}catch(Exception e){e.getMessage();}finally{cn.close();}
	}
	
	public void savephoto(String id,String filepath,String photofilename,String photocontenttype)throws Exception{
	

		File file=new File(filepath+"/"+photofilename);
		if(file.exists())
		{
			//String sql="update foodphoto set photo=?,photofilename=?,photocontenttype=? where fpid=?";
			String sql="insert into foodphoto(fpid,photo,photofilename,photocontenttype) values (?,?,?,?)";
			Connection cn=ConnectionFactory.getConnection();
			System.out.println(id);
			System.out.println(filepath);
			System.out.println(photofilename);
			System.out.println(photocontenttype);
			PreparedStatement ps=cn.prepareStatement(sql);
			InputStream in=new FileInputStream(filepath+"/"+photofilename);
	       
		
			
			ps.setString(1, id); 
			ps.setBinaryStream(2, in, in.available());
			ps.setString(3, photofilename);
			ps.setString(4, photocontenttype);
			ps.executeUpdate();
			System.out.println("shuju");
			ps.close();
			cn.close();
			//删除此文件
			file.delete();
		}
		
		
	}
	public FoodValue getFoodValueBySearch()throws Exception{
		String sql="select *from food";
		Connection cn=null;

			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
				FoodValue fv=new FoodValue();

			ResultSet rs=ps.executeQuery();	
		
			while(rs.next()){
			
				
				fv.setFid(Integer.parseInt(rs.getString("fid")));
				fv.setFname(rs.getString("fname"));
				fv.setFtype(rs.getString("Ftype"));
				fv.setFprice(rs.getString("fprice"));
				fv.setFshock(rs.getString("fshock"));
				
				
				
			
		
			}
			rs.close();
			cn.close();
			return fv;
	
}
	public FoodValue getFoodValue(int i)throws Exception{
		String sql="select fid,fname,ftype,fprice,fshock from food  where fid=i";
		Connection cn=null;
		FoodValue fv=new FoodValue ();

		try{
			cn=ConnectionFactory.getConnection();
		
			PreparedStatement ps=cn.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();	
		
			while(rs.next()){
			
				System.out.println("lalala");
				fv.setFid(Integer.parseInt(rs.getString("fid")));
				fv.setFname(rs.getString("fname"));
				fv.setFtype(rs.getString("ftype"));
				fv.setFprice(rs.getString("fprice"));
				fv.setFshock(rs.getString("fshock"));
				
			}
			rs.close();
			cn.close();
			System.out.println("la");
		}catch(Exception e){e.getMessage();}	
		return fv;	
		
	}
	public void deletefood(String id) throws Exception{
		String sql="delete from food where fid=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, id);
		ps.executeUpdate();
		ps.close();
		cn.close();
	}
	public void update(FoodValue fv) throws Exception{

		String sql="update food set fname=?,ftype=?,fprice=?,fshock=? where fid=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setInt(1, fv.getFid());
		ps.setString(2, fv.getFname());
		ps.setString(3, fv.getFprice());
		ps.setString(4,fv.getFtype());
		ps.setString(5, fv.getFshock());
		ps.executeUpdate();
		
		ps.close();
		cn.close();
	}
}
