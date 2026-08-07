package com.opencart.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public static WebDriver getDriver() throws Exception {

        ConfigReader config = new ConfigReader();

        String browser = config.getProperty("browser");

        WebDriver driver = null;

        if (browser.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.setExperimentalOption("prefs",
            java.util.Map.of("autofill.profile_enabled", false));

            driver = new ChromeDriver(options);
        }

        return driver;
    }
}