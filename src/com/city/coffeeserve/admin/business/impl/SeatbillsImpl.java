package com.city.coffeeserve.admin.business.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.city.coffeeserve.admin.ConnectionFactory.ConnectionFactory;
import com.city.coffeeserve.admin.business.ISeatbills;
import com.city.coffeeserve.admin.dao.IFooddao;
import com.city.coffeeserve.admin.dao.ISeatbillsDao;
import com.city.coffeeserve.admin.factory.DaoFactory;
import com.city.coffeeserve.note.value.FoodValue;
import com.city.coffeeserve.note.value.SeatbillsValue;


public class SeatbillsImpl implements ISeatbills{
	public void addSeatbill(int sbid,String sbwaiter,String sbprice,String sbtime)throws Exception{
		SeatbillsValue sv=new SeatbillsValue();
		sv.setSbid(sbid);
		sv.setSbwaiter(sbwaiter);
		sv.setSbprice(sbprice);
		sv.setSbtime(sbtime);
		ISeatbillsDao sdo=DaoFactory.createISeatbillsDao();
		sdo.createSeatbill(sv);
	}
	public int getbill(int i,int j)throws Exception{
		int t=0;
		int t1=0;
		int t2=0;
		FoodValue fv=new FoodValue();
		SeatbillsValue sv=new SeatbillsValue();
		IFooddao fdo=DaoFactory.createFoodDao();
		ISeatbillsDao sdo=DaoFactory.createISeatbillsDao();
		try {
			fv=fdo.getFoodValue(i);
			sv=sdo.getSeatbillValue(j);
			t1=Integer.parseInt(sv.getSbprice());
			t2=Integer.parseInt(fv.getFprice());
			t=t1+t2;
			System.out.println("lalalalalala");
		System.out.println(t);
		}catch(Exception e){e.getMessage();}
		
		return t;
		
	}
	public List getSeatbillList(int i)throws Exception{
		List sList =new ArrayList();
		SeatbillsValue sv=new SeatbillsValue();
		ISeatbillsDao sdo=DaoFactory.createISeatbillsDao();
		sv=sdo.getSeatbillValue(i);
		sList.add(sv);
		return sList;
		
	}
}
