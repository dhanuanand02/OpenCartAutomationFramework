package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.RegisterPage;

public class TC002_InvalidRegistrationTest extends BaseClass {

    @Test
    public void verifyRegistrationWithPasswordMismatch() {

        RegisterPage rp = new RegisterPage(driver);

        rp.clickMyAccount();
        rp.clickRegister();

        rp.enterFirstName("Dhanu");
        rp.enterLastName("Anand");

        String email = "dhanu123@gmail.com";
        rp.enterEmail(email);

        rp.enterTelephone("9876543210");
        rp.enterPassword("Test@123");

        // Different confirm password
        rp.enterConfirmPassword("Test@456");

        rp.clickPrivacyPolicy();
        rp.clickContinue();

        // Verify error message
        Assert.assertEquals( rp.getPasswordMismatchError(),"Password confirmation does not match password!");
        System.out.println("Password mismatch validation verified successfully");
    }
}