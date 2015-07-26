package com.city.coffeeserve.admin.dao;

import com.city.coffeeserve.note.value.FoodValue;
import com.city.coffeeserve.note.value.waitersvalue;


public interface IFooddao{
	public void createFood(FoodValue food)throws Exception;
	public void savephoto(String id,String filepath,String filename,String contenttype)throws Exception;
	public FoodValue getFoodValueBySearch()throws Exception;
	public FoodValue getFoodValue(int i)throws Exception;
	public void deletefood(String id) throws Exception;
	public void update(FoodValue fv) throws Exception;

}
