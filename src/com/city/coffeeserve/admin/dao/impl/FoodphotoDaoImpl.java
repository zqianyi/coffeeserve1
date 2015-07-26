package com.city.coffeeserve.admin.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.city.coffeeserve.admin.ConnectionFactory.ConnectionFactory;
import com.city.coffeeserve.admin.dao.IFoodphotoDao;
import com.city.coffeeserve.note.value.FoodValue;
import com.city.coffeeserve.note.value.FoodphotosValue;

public class FoodphotoDaoImpl implements IFoodphotoDao{
	public FoodphotosValue getFoodphoto(String id){
		System.out.println(id);
		String sql="select photofilename, photocontenttype from foodphoto where fpid=id";
		Connection cn=null;
	   FoodphotosValue fpv=new FoodphotosValue ();

		try{
			
			
			cn=ConnectionFactory.getConnection();
		System.out.println("lalalalalal");
			PreparedStatement ps=cn.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();	
		    
					
			while(rs.next()){
			
				fpv.setFpid(rs.getString("fpid"));
				fpv.setPhotofilename(rs.getString("photofilename"));
				fpv.setPhotocontenttype(rs.getString("photocontenttype"));
				
			}
		
			
			rs.close();
			cn.close();
			System.out.println("lL");
			
		}catch(Exception e){   e.getMessage();}	
		return fpv;	
			
	}
}
