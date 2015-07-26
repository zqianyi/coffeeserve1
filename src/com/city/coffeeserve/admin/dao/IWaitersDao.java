package com.city.coffeeserve.admin.dao;


import java.util.List;

import com.city.coffeeserve.note.value.FoodValue;
import com.city.coffeeserve.note.value.waitersvalue;

public interface IWaitersDao {
	
	public waitersvalue selectWaiter(String wname,String wpassword)throws Exception;
	public void createWaiter(waitersvalue waiters)throws Exception;
	public boolean findWaiter(String wname,String wpassword)throws Exception;
	public void deletewaiter(String id) throws Exception;
	public void update(waitersvalue wv) throws Exception;
	
}
