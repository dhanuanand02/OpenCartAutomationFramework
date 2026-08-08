package com.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.opencart.utilities.ConfigReader;
import com.opencart.utilities.DriverFactory;
import com.opencart.utilities.ScreenShotUtil;

public class BaseClass {

    public WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        driver = DriverFactory.getDriver();

        ConfigReader config = new ConfigReader();

        driver.get(config.getProperty("url"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            ScreenShotUtil.takeScreenshot(driver, result.getName());
        }

        driver.quit();
    
    }
}