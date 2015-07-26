package com.city.coffeeserve.admin.factory;

import com.city.coffeeserve.admin.business.IFood;
import com.city.coffeeserve.admin.business.IFoodphoto;
import com.city.coffeeserve.admin.business.IWaiters;
import com.city.coffeeserve.admin.business.impl.FoodImpl;
import com.city.coffeeserve.admin.business.impl.FoodphotoImpl;
import com.city.coffeeserve.admin.business.impl.WaitersImpl;

public class businessFactory {
	public static IWaiters createWaiter(){
		return new WaitersImpl();
	}
	public static IFood createFood(){
		return new FoodImpl();
	}
	public static IFoodphoto createFoodphoto(){
		return new FoodphotoImpl();
	}
}
