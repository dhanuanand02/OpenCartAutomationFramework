package com.opencart.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	WebDriver driver;

	public WebDriver launchBrowser() throws Exception {

		ConfigReader config = new ConfigReader();

		String browser = config.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}

		driver.manage().window().maximize();

		return driver;

	}

}