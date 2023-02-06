package com.adactin.pageexe;





import com.adactin.locators.LoginPageLocators;
import com.base.utils.BaseClass;

public class LoginPage extends BaseClass{
	

public static void logic()
{
browserOpen("chrome");	
loadUrl("https://adactinhotelapp.com/");
dataSend(new LoginPageLocators().getUsrname(),"SarathSara");
dataSend(new LoginPageLocators().getPsw(),"Shivaya@1213");
click(new LoginPageLocators().getLgb());
}
	}

