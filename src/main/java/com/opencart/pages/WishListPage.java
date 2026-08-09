package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opencart.utilities.WaitUtils;

public class WishListPage {
	
	WebDriver driver;
	WaitUtils wait ;
	
	public WishListPage(WebDriver driver) {
		this.driver=driver;
		wait = new WaitUtils(driver);
	
	}
	By addToWishlist = By.xpath("(//button[@data-original-title='Add to Wish List'])[1]");
	By wishList = By.id("wishlist-total");
	By addToCartbtn = By.xpath("//button[@class='btn btn-primary']");
	By removeButton =By.xpath("//a[contains(@class,'btn-danger')]");
	By continueBtn =By.xpath("//a[contains(text(),'Continue')]");
	
	
	public void addToWishlist() {
	    driver.findElement(addToWishlist).click();
	}
	
	public void clickWishList() {
		driver.findElement(wishList).click();
	}
	
	public void clickAddToCart() {
		driver.findElement(addToCartbtn).click();
	}
	
	public void clickRemoveBtn() {
		driver.findElement(removeButton).click();
	}
	
	public void clickContinueBtn() {
		driver.findElement(continueBtn).click();
	}

}
