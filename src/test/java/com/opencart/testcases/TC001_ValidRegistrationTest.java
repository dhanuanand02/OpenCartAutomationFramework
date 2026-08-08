package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.RegisterPage;

public class TC001_ValidRegistrationTest extends BaseClass {

    @Test
    public void verifyValidRegistration() {

        RegisterPage rp = new RegisterPage(driver);

        rp.clickMyAccount();
        rp.clickRegister();
        rp.enterFirstName("Dhanu");
        rp.enterLastName("Anand");
        String email = "dhaanu@gmail.com";
        rp.enterEmail(email);

        rp.enterTelephone("9876543210");
        rp.enterPassword("Test@123");
        rp.enterConfirmPassword("Test@123");

        rp.clickPrivacyPolicy();
        rp.clickContinue();

        
        Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");

        System.out.println("Registration Successful");
    }

}