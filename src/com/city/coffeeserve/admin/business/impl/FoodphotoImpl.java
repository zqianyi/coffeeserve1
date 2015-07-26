package com.city.coffeeserve.admin.business.impl;

import com.city.coffeeserve.admin.business.IFoodphoto;
import com.city.coffeeserve.admin.dao.IFoodphotoDao;
import com.city.coffeeserve.admin.dao.ISeatbillsDao;
import com.city.coffeeserve.admin.factory.DaoFactory;
import com.city.coffeeserve.note.value.FoodphotosValue;

public class FoodphotoImpl implements IFoodphoto{
	public FoodphotosValue getFoodphoto(String id){
		FoodphotosValue fpv=new FoodphotosValue();
		IFoodphotoDao ifd=DaoFactory.createIFoodphotosDao();
		fpv=ifd.getFoodphoto(id);
		return fpv;
		
	}
}
