package com.bdd_ecommerce.Stepdefinitions;

import org.apache.log4j.Logger;

import com.bdd_ecommerce.pageobjects.CheckoutPage;
import com.bdd_ecommerce.testcomponents.TestContextSetup;

import io.cucumber.java.en.And;

public class CheckOutPageSteps {

	TestContextSetup testContextSetup;
	CheckoutPage checkoutpage ;
	private static final Logger LOGGER = Logger.getLogger(CheckOutPageSteps.class);
	
	public CheckOutPageSteps(TestContextSetup testContextSetup) {
		
		this.testContextSetup= testContextSetup;
		this.checkoutpage = testContextSetup.pageObjectManager.getCheckOutPage();
	}
	
	@And("Enter details and submitorder")
	public void enter_details_and_submitorder() throws InterruptedException {
		
		//Thread.sleep(3000);
		checkoutpage.selectCountry("india");
		LOGGER.info("----- moved to checkout from cartpage -----");	
	//	Thread.sleep(3000);
		  checkoutpage.submitOrder();
			LOGGER.info("----- submitted order from checkout -----");	
	}
	
}
