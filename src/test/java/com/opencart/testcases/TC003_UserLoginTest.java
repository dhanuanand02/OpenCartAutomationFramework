package com.opencart.testcases;

import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.LoginPage;

public class TC003_UserLoginTest extends BaseClass {
	@Test
	public void ValidUserLogin() {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.clickMyAccount();
		lp.ClickLogin();
		lp.EnterUserMailId("dhaanu@gmail.com");
		lp.EnterUserPassword("Test@123");
		lp.ClickLoginBtn();
		
		
	}
	
	

}
