package com.bdd_ecommerce.Stepdefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.bdd_ecommerce.pageobjects.CartPage;
import com.bdd_ecommerce.testcomponents.Base;
import com.bdd_ecommerce.testcomponents.TestContextSetup;

import io.cucumber.java.en.And;

public class CartPageSteps {


	TestContextSetup testContextSetup;
	CartPage cartpage ;
	//CheckoutPage checkoutpage;
	
	private static final Logger LOGGER = Logger.getLogger(CartPageSteps.class);
	
	public CartPageSteps(TestContextSetup testContextSetup) {
		
		this.testContextSetup= testContextSetup;
		this.cartpage = testContextSetup.pageObjectManager.getCartPage();
	}
	
	@And("^Checkout (.+) from cartpage$")
	public void Checkout_from_cartpage(String productName) throws InterruptedException {
	
	//cartpage.goToCartPage();
		//Thread.sleep(3000);
	Boolean match = cartpage.VerifyProductDisplay(productName);
	Assert.assertTrue(match);
	LOGGER.info("----- verfied product from cartpage -----");	
	//Thread.sleep(3000);
	cartpage.goToCheckout();
	LOGGER.info("----- moved to checkout from cartpage -----");	
	

}
}
