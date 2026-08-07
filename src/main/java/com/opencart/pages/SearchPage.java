package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.opencart.utilities.WaitUtils;

public class SearchPage {

    WebDriver driver;
    WaitUtils wait;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    // LOGIN

    By lnkMyAccount = By.xpath("//a[@title='My Account']");
    By lnkLogin = By.linkText("Login");
    By txtUserMail = By.id("input-email");
    By txtUserPassword = By.id("input-password");
    By loginBtn = By.xpath("//input[@type='submit']");


    // SEARCH PRODUCT

    By searchBox = By.xpath("//input[@class='form-control input-lg']");
    By searchBtn = By.xpath("//span[@class='input-group-btn']");
    By macBook = By.linkText("MacBook");
    By addToCartBtn = By.id("button-cart");


    // CART

    By cart = By.id("cart-total");
    By checkOutBtn = By.xpath("//a[@title='Checkout']");


    //  BILLING ADDRESS

    By newAddress = By.xpath("//input[@name='payment_address' and @value='new']");
            

    By firstName = By.id("input-payment-firstname");
    By lastName = By.id("input-payment-lastname");
    By address = By.id("input-payment-address-1");
    By city = By.id("input-payment-city");
    By postCode = By.id("input-payment-postcode");

    By country = By.id("input-payment-country");
    By regionState = By.id("input-payment-zone");

    By continueBtn = By.id("button-payment-address");


    //  DELIVERY METHOD 

    By delMethodContinueBtn = By.id("button-shipping-method");


    // PAYMENT METHOD
    By paymentRadioBtn = By.xpath("//input[@value='bank_transfer']");
    By termNdCond = By.xpath("//input[@name='agree' and @value='1']");

    By payContinueBtn =  By.id("button-payment-method");
           
    // CONFIRM ORDER

    By cnfrmBtn = By.id("button-confirm");

    // LOGIN METHODS
    
    public void clickMyAccount() {
        driver.findElement(lnkMyAccount).click();
    }

    public void clickLogin() {
        driver.findElement(lnkLogin).click();
    }

    public void enterUserMailId(String mailid) {
        driver.findElement(txtUserMail).sendKeys(mailid);
    }

    public void enterUserPassword(String pass) {
        driver.findElement(txtUserPassword).sendKeys(pass);
    }

    public void clickLoginBtn() {
        driver.findElement(loginBtn).click();
    }


    // SEARCH PRODUCT
  
    public void searchProduct(String productName) {

        wait.waitForVisible(searchBox);

        driver.findElement(searchBox).sendKeys(productName);

        wait.waitForClick(searchBtn);

        driver.findElement(searchBtn).click();
    }

    public void selectMacBook() {

        wait.waitForClick(macBook);

        driver.findElement(macBook).click();
    }

    public void addToCart() {

        wait.waitForClick(addToCartBtn);

        driver.findElement(addToCartBtn).click();
    }


     // CART
    public void openCart() {

        wait.waitForClick(cart);

        driver.findElement(cart).click();
    }

    public void clickCheckout() {

        wait.waitForClick(checkOutBtn);

        driver.findElement(checkOutBtn).click();
    }

    // BILLING ADDRESS
    
    public void selectNewAddress() {

        wait.waitForClick(newAddress);

        driver.findElement(newAddress).click();
    }

    public void enterBillingDetails(String fName, String lName,String addressValue,String cityValue,String postCodeValue) {
           
    	wait.waitForVisible(firstName);
        driver.findElement(firstName).sendKeys(fName);

        wait.waitForVisible(lastName);
        driver.findElement(lastName).sendKeys(lName);

        wait.waitForVisible(address);
        driver.findElement(address).sendKeys(addressValue);

        wait.waitForVisible(city);
        driver.findElement(city).sendKeys(cityValue);

        wait.waitForVisible(postCode);
        driver.findElement(postCode).sendKeys(postCodeValue);
    }

    public void selectCountry(String countryName) {

        wait.waitForVisible(country);

        Select select = new Select(driver.findElement(country));

        select.selectByVisibleText(countryName);

        System.out.println(select.getFirstSelectedOption().getText());
    }

    public void selectState(String stateName) {

        wait.waitForVisible(regionState);

        Select select = new Select(driver.findElement(regionState));

        select.selectByVisibleText(stateName);

        System.out.println(select.getFirstSelectedOption().getText());
    }



    public void clickBillingContinue() {

        wait.waitForClick(continueBtn);

        WebElement button = driver.findElement(continueBtn);

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", button);
    }


    public void clickDeliveryMethodContinue() {

        wait.waitForClick(delMethodContinueBtn);

        driver.findElement(delMethodContinueBtn).click();
    }

// PAYMENT
    public void selectBankTransfer() {

        wait.waitForClick(paymentRadioBtn);

        driver.findElement(paymentRadioBtn).click();
    }

    public void acceptTerms() {

        wait.waitForClick(termNdCond);

        driver.findElement(termNdCond).click();
    }

    public void clickPaymentContinue() {

        wait.waitForClick(payContinueBtn);

        driver.findElement(payContinueBtn).click();
    }


// ORDER CONFIRM
    public void clickConfirmOrder() {

        wait.waitForClick(cnfrmBtn);

        driver.findElement(cnfrmBtn).click();
    }
}