package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.base.BaseClass;

public class LaunchApp extends BaseClass {

    @Test
    public void verifyApplicationLaunch() {

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String expectedTitle = "Your Store";

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Application launched successfully");

    }

}