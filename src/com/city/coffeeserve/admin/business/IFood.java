package com.city.coffeeserve.admin.business;

import java.util.List;

import com.city.coffeeserve.note.value.FoodValue;

public interface IFood {
	public void addFood(int fid,String fname,String ftype,String fprice,String fshock)throws Exception;
	public void savephoto(String id,String filepath,String photofilename,String photocontenttype)throws Exception;
	public List getFoodListValueBySearch()throws Exception;
	public List getFoodList(int i)throws Exception;
	public void deletefood(String id) throws Exception;
	public void modify(int fid, String fname, String ftype, String fprice,String fshock) throws Exception;
}
