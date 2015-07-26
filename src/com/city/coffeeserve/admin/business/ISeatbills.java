package com.city.coffeeserve.admin.business;

import java.util.List;

import com.city.coffeeserve.note.value.FoodValue;
import com.city.coffeeserve.note.value.SeatbillsValue;

public interface ISeatbills {
	public void addSeatbill(int sbid,String sbwaiter,String sbprice,String sbtime)throws Exception;
	
	public int getbill(int i,int j)throws Exception;
	public List getSeatbillList(int i)throws Exception;
}
