package com.opencart.testcases;

import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.LoginPage;
import com.opencart.pages.SearchPage;
import com.opencart.pages.WishListPage;

public class TC007_WishlistAddToCartTest extends BaseClass {

    @Test
    public void verifyWishlistProductCanBeAddedToCart() {

        LoginPage lp = new LoginPage(driver);
        WishListPage wp = new WishListPage(driver);
        SearchPage sp = new SearchPage(driver);

        lp.clickMyAccount();
		lp.ClickLogin();
		lp.EnterUserMailId("dhaanu@gmail.com");
		lp.EnterUserPassword("Test@123");
		lp.ClickLoginBtn();
		

        sp.searchProduct("MacBook");
        sp.selectMacBook();
        wp.addToWishlist();
		
		wp.clickWishList();
		wp.clickAddToCart();
		wp.clickContinueBtn();
		

		

        

        
        
      

      
    }
}