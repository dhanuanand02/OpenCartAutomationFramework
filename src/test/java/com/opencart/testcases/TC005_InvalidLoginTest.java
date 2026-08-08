package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.LoginPage;


public class TC005_InvalidLoginTest extends BaseClass {
	
	@Test
	public void VerifyLoginWithInvalidPassword() {
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.clickMyAccount();
		lp.ClickLogin();
		lp.EnterUserMailId("dhaanu@gmail.com");
		lp.EnterUserPassword("1223@gmail.com");
		lp.ClickLoginBtn();
		
		String error= lp.getErrorMessage();
		Assert.assertTrue( error.contains("abc"),"Invalid login error message was not displayed");
		      
               
               
		
	}

}
