package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By lnkMyAccount = By.xpath("//a[@title='My Account']");
	By lnkLogin= By.linkText("Login");
	
	By txtUserMail = By.id("input-email");
	By txtUserPassword = By.id("input-password");
	By loginBtn = By.xpath("//input[@type='submit']");
	
	public void clickMyAccount() {
        driver.findElement(lnkMyAccount).click();
    }
	
	public void ClickLogin() {
		driver.findElement(lnkLogin).click();
		
	}
	
	public void EnterUserMailId(String mailid) {
		
		driver.findElement(txtUserMail).sendKeys(mailid);
		
	}
	
	public void EnterUserPassword(String pass) {
		driver.findElement(txtUserPassword).sendKeys(pass);
	}
	
	public void ClickLoginBtn() {
		driver.findElement(loginBtn).click();
	}

}
