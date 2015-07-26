package com.city.coffeeserve.admin.factory;

import com.city.coffeeserve.admin.dao.IFooddao;
import com.city.coffeeserve.admin.dao.IFoodphotoDao;
import com.city.coffeeserve.admin.dao.ISeatbillsDao;
import com.city.coffeeserve.admin.dao.ISeatsDao;
import com.city.coffeeserve.admin.dao.IWaitersDao;
import com.city.coffeeserve.admin.dao.impl.FoodDaoImpl;
import com.city.coffeeserve.admin.dao.impl.FoodphotoDaoImpl;
import com.city.coffeeserve.admin.dao.impl.SeatsDaoImpl;
import com.city.coffeeserve.admin.dao.impl.WaitersDaoImpl;
import com.city.coffeeserve.admin.dao.impl.seatbillsDaoImpl;

public class DaoFactory {
	public static IWaitersDao createWaitersDao(){
		return new WaitersDaoImpl();
		
	}
	public static IFooddao createFoodDao(){
		return new FoodDaoImpl();
		
	}
	public static ISeatbillsDao createISeatbillsDao(){
		return new seatbillsDaoImpl();
		
	}
	public static IFoodphotoDao createIFoodphotosDao(){
		return new  FoodphotoDaoImpl();
		
	}
	public static ISeatsDao createSeatsDao(){
		return new  SeatsDaoImpl();
		
	}


}
