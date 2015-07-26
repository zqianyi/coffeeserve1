package com.city.coffeeserve.admin.business.impl;

import java.util.ArrayList;
import java.util.List;

import com.city.coffeeserve.admin.business.IWaiters;
import com.city.coffeeserve.admin.dao.IFooddao;
import com.city.coffeeserve.admin.dao.IWaitersDao;
import com.city.coffeeserve.admin.dao.impl.WaitersDaoImpl;
import com.city.coffeeserve.admin.factory.DaoFactory;
import com.city.coffeeserve.note.value.FoodValue;
import com.city.coffeeserve.note.value.waitersvalue;

public class WaitersImpl implements IWaiters{
	public void addWaiter(int wid,String wname,String wpassword,String wsex,String wphone)throws Exception{
		waitersvalue wv=new waitersvalue();
		wv.setWid(wid);
		wv.setWname(wname);
		wv.setWpassword(wpassword);
		wv.setWphone(wphone);
		wv.setWsex(wsex);
		IWaitersDao edo=DaoFactory.createWaitersDao();
		edo.createWaiter(wv);
	}
	public boolean seekWaiter(String wname,String wpassword)throws Exception{
		boolean t;
		IWaitersDao edo=DaoFactory.createWaitersDao();
		t=edo.findWaiter(wname,wpassword);
		return t;
		
	}
	public waitersvalue selectWaiter(String wname,String wpassword)throws Exception{
		 waitersvalue wv=new waitersvalue();
		 IWaitersDao edo=DaoFactory.createWaitersDao();
			wv=edo.selectWaiter(wname,wpassword);
			return wv;
		 
	}
	public void deletewaiter(String id) throws Exception{
		IWaitersDao iwd=DaoFactory.createWaitersDao();
		iwd.deletewaiter(id);
	}
	public void updatewaiter(int wid,String wname,String wpassword,String wsex,String wphone) throws Exception{
		waitersvalue wv=new waitersvalue();
		wv.setWid(wid);
		wv.setWpassword(wpassword);
		wv.setWname(wname);
		wv.setWsex(wsex);
		wv.setWphone(wphone);
		WaitersDaoImpl wdi=new WaitersDaoImpl();
		wdi.update(wv);
		
	}
}
