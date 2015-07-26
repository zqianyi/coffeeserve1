package com.city.coffeeserve.admin.dao;

import com.city.coffeeserve.note.value.SeatsValue;

public interface ISeatsDao {
	public SeatsValue getseat(String sid)throws Exception;
}
