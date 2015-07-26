package com.city.coffeeserve.admin.business.impl;

import java.util.ArrayList;
import java.util.List;

import com.city.coffeeserve.admin.business.IFood;
import com.city.coffeeserve.admin.dao.IFooddao;
import com.city.coffeeserve.admin.dao.impl.FoodDaoImpl;
import com.city.coffeeserve.admin.factory.DaoFactory;
import com.city.coffeeserve.note.value.FoodValue;


public class FoodImpl implements IFood{
	public void addFood(int fid,String fname,String ftype,String fprice,String fshock)throws Exception{
		FoodValue fv=new FoodValue();
		fv.setFid(fid);
		fv.setFname(fname);
		fv.setFtype(ftype);
		fv.setFprice(fprice);
		fv.setFshock(fshock);
	
		IFooddao fdo=DaoFactory.createFoodDao();
		fdo.createFood(fv);
	}
	public void savephoto(String id,String filepath,String photofilename,String photocontenttype)throws Exception{
		IFooddao fdo=DaoFactory.createFoodDao();
		fdo.savephoto(id,filepath,photofilename,photocontenttype);
		
	}
	public List getFoodListValueBySearch()throws Exception{
		List fList =new ArrayList();
		FoodValue fv=new FoodValue();
		IFooddao fdo=DaoFactory.createFoodDao();
		fv=fdo. getFoodValueBySearch();
		fList.add(fv);
		return fList;
		
		

	}
	public List getFoodList(int i)throws Exception{
		List fList =new ArrayList();
		FoodValue fv=new FoodValue();
		IFooddao fdo=DaoFactory.createFoodDao();
		fv=fdo. getFoodValue(i);
		fList.add(fv);
		return fList;
	}
	public void deletefood(String id) throws Exception{
		IFooddao fdo=DaoFactory.createFoodDao();
		fdo.deletefood(id);
	}
	public void modify(int fid,String fname, String ftype, String fprice,String fshock) throws Exception{
		FoodValue fv=new FoodValue();
		fv.setFid(fid);
		fv.setFname(fname);
		fv.setFprice(fprice);
		fv.setFshock(fshock);
		fv.setFtype(ftype);
		System.out.println(fv.getFname());
		FoodDaoImpl fdi=new FoodDaoImpl();
		fdi.update(fv);
	}

}
