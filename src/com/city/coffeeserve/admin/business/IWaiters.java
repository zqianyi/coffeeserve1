package com.city.coffeeserve.admin.business;

import java.util.List;

import com.city.coffeeserve.note.value.waitersvalue;

public interface IWaiters {
	public void addWaiter(int wid,String wname,String wpassword,String wsex,String wphone)throws Exception;
	public boolean seekWaiter(String wname,String wpassword)throws Exception;
	public waitersvalue selectWaiter(String wname,String wpassword)throws Exception;
	public void deletewaiter(String id) throws Exception;
	public void updatewaiter(int wid,String wname,String wpassword,String wsex,String wphone) throws Exception;
}
