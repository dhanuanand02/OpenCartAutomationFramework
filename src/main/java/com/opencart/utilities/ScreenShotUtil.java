package com.opencart.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtil {

    public static void takeScreenshot(WebDriver driver, String name) {

        try {

            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE);

            File destination = new File("./screenshots/" + name + ".png");

            FileUtils.copyFile(source, destination);

            System.out.println("Screenshot taken");

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}