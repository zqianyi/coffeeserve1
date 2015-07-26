package com.city.coffeeserve.admin.dao;

import com.city.coffeeserve.note.value.SeatbillsValue;


public interface ISeatbillsDao {
	public void createSeatbill(SeatbillsValue Seatbills)throws Exception;
	public SeatbillsValue getSeatbillValue(int i)throws Exception;
}
