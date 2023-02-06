package com.adactin.test;

import org.junit.Test;

import com.adactin.pageexe.LoginPage;
import com.adactin.pageexe.SearchHotelPage;

public class SearchHotelPageTest {

	@Test
	public void validateLocationDropdown() {
		LoginPage.logic();
		SearchHotelPage.selectLocation();
	}
}
