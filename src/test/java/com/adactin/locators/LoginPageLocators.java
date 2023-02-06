package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class LoginPageLocators extends BaseClass{
	public LoginPageLocators()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='username']")
	private WebElement usrname;
	public WebElement getUsrname() {
		return usrname;
	}
	@FindBy(id="password")
	private WebElement psw;
	public WebElement getPsw() {
		return psw;
	}
	@FindBy(xpath="//input[@name='login']")
	private WebElement lgb;
	public WebElement getLgb() {
		return lgb;
	}
	
	
}

