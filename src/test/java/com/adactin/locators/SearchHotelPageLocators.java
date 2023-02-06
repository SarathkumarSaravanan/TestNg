package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;


public class SearchHotelPageLocators extends BaseClass{
	
	public SearchHotelPageLocators(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	
	////*[@name='location' and @id='location']
	
//	@FindBys({
//		@FindBy(id="hotels"),
//		@FindBy(name="hotels")}) //based on && Operator
//	private WebElement hotels;
	
//	@FindAll({
//		@FindBy(id="hotels"), 
//		@FindBy(name="hotel")}) //based on || Operator
//	private WebElement hotels;
}
