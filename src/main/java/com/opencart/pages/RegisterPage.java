package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}
	By lnkMyAccount = By.xpath("//a[@title='My Account']");
    By lnkRegister = By.linkText("Register");

    
    By txtFirstName = By.id("input-firstname");
    By txtLastName = By.id("input-lastname");
    By txtEmail = By.id("input-email");
    By txtTelephone = By.id("input-telephone");
    By txtPassword = By.id("input-password");
    By txtConfirmPassword = By.id("input-confirm");
    By chkPolicy = By.name("agree");
    By btnContinue = By.xpath("//input[@value='Continue']");

    public void clickMyAccount() {
        driver.findElement(lnkMyAccount).click();
    }

    public void clickRegister() {
        driver.findElement(lnkRegister).click();
    }

    public void enterFirstName(String fname) {
        driver.findElement(txtFirstName).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        driver.findElement(txtLastName).sendKeys(lname);
    }

    public void enterEmail(String email) {
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void enterTelephone(String phone) {
        driver.findElement(txtTelephone).sendKeys(phone);
    }

    public void enterPassword(String pwd) {
        driver.findElement(txtPassword).sendKeys(pwd);
    }

    public void enterConfirmPassword(String pwd) {
        driver.findElement(txtConfirmPassword).sendKeys(pwd);
    }

    public void clickPrivacyPolicy() {
        driver.findElement(chkPolicy).click();
    }

    public void clickContinue() {
        driver.findElement(btnContinue).click();
    }
}
	
	
	


