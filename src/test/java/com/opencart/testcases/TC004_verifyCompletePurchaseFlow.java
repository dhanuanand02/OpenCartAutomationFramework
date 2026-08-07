package com.opencart.testcases;

import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.LoginPage;
import com.opencart.pages.SearchPage;

public class TC004_verifyCompletePurchaseFlow extends BaseClass {

    @Test
    public void placeOrderTest() {

        SearchPage checkout = new SearchPage(driver);

        LoginPage lp = new LoginPage(driver);



        lp.clickMyAccount();
        lp.ClickLogin();

        lp.EnterUserMailId("dhaanu@gmail.com");
        lp.EnterUserPassword("Test@123");

        lp.ClickLoginBtn();

        checkout.searchProduct("MacBook");
        checkout.selectMacBook();
        checkout.addToCart();
        checkout.openCart();
        checkout.clickCheckout();

//  BILLING ADDRESS

        checkout.selectNewAddress();

        checkout.enterBillingDetails(
                "Dhanu",
                "Anand",
                "Nangannalur",
                "Chennai",
                "600001"
        );

        checkout.selectCountry("India");

        checkout.selectState("Assam");
        
        checkout.clickBillingContinue();
        
// PAYMENT METHOD 

//checkout.selectBankTransfer();

      checkout.acceptTerms();

      checkout.clickPaymentContinue();

      checkout.clickConfirmOrder();
  }
}




     

       


       

       


        

        

  





      
