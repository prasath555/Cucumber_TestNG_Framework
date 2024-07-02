package com.bdd_ecommerce.Stepdefinitions;

import org.apache.log4j.Logger;

import com.bdd_ecommerce.pageobjects.ConfirmationPage;
import com.bdd_ecommerce.testcomponents.TestContextSetup;

import io.cucumber.java.en.Then;

public class ConfirmationPageSteps {

	TestContextSetup testcontextsetup;
	ConfirmationPage confirmationpage;
	private static final Logger LOGGER = Logger.getLogger(ConfirmationPageSteps.class);

	public ConfirmationPageSteps(TestContextSetup testcontextsetup) {

		this.testcontextsetup = testcontextsetup;
		this.confirmationpage= testcontextsetup.pageObjectManager.getConfirmationPage();
	}

	@Then("^(.+) message is displayed on ConfirmationPage$")
	public void message_is_displayed_on_confirmation_page(String confirmationMessage) throws InterruptedException {
	
		//Thread.sleep(3000);
		confirmationpage.getConfirmationMessage();
		LOGGER.info("----- verifing confirmation message-----");
	
	}
}
