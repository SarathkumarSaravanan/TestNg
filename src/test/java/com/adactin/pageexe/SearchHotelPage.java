package com.adactin.pageexe;

import com.adactin.locators.SearchHotelPageLocators;
import com.base.utils.BaseClass;

public class SearchHotelPage extends BaseClass{
	
	public static void selectLocation() {
		try {
		selectByIndex(new SearchHotelPageLocators().getLocation(), 2);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
