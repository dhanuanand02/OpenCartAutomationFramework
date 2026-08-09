package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.LoginPage;

public class TC006_EmptyLoginFieldTest extends BaseClass {
	
	@Test
	
	public void VerifyLoginWithEmptyFields() {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.clickMyAccount();
		lp.ClickLogin();
		lp.EnterUserMailId("");
		lp.EnterUserPassword("");
		lp.ClickLoginBtn();
		
		String actualError = lp.getErrorMessage();
		System.out.println(actualError);

		String expectedError ="No match for E-Mail Address and/or Password.";

		Assert.assertEquals(actualError, expectedError);
		
		
		
		
		
		
		
	}

}
