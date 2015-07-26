package com.city.coffeeserve.admin.business.impl;

import com.city.coffeeserve.admin.business.ISeats;
import com.city.coffeeserve.admin.dao.ISeatsDao;
import com.city.coffeeserve.admin.dao.IWaitersDao;
import com.city.coffeeserve.admin.dao.impl.SeatsDaoImpl;
import com.city.coffeeserve.admin.factory.DaoFactory;
import com.city.coffeeserve.note.value.SeatsValue;

public class SeatsImpl implements ISeats{
	public int getseat(String sid)throws Exception{
		int i=0;
		SeatsValue si=new SeatsValue();
		SeatsDaoImpl sdi=new SeatsDaoImpl();
		si=sdi.getseat(sid);
		i=Integer.parseInt(si.getSfree());
		System.out.println(i);
		return i;
		
	}
}
