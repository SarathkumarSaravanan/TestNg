package com.adactin.test;

import org.junit.Test;

import com.adactin.pageexe.LoginPage;
import com.base.utils.BaseClass;

public class LoginPageTest extends BaseClass{
	
	@Test
	public void adactinLogin() {
		LoginPage.logic();
	}
}
