package com.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.opencart.utilities.ConfigReader;
import com.opencart.utilities.DriverFactory;

public class BaseClass {

    public WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        driver = DriverFactory.getDriver();

        ConfigReader config = new ConfigReader();

        driver.get(config.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}