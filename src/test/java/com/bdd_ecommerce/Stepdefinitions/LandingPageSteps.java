package com.bdd_ecommerce.Stepdefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.bdd_ecommerce.pageobjects.LandingPage;
import com.bdd_ecommerce.testcomponents.TestContextSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageSteps {

	private static final Logger LOGGER = Logger.getLogger(LandingPageSteps.class);
	TestContextSetup testcontextsetup;
	LandingPage landingpage;

	public LandingPageSteps(TestContextSetup testcontextsetup) {

		this.testcontextsetup = testcontextsetup;

		this.landingpage = testcontextsetup.pageObjectManager.getLandingPage();
	}

	@Given("I landed on Ecommerce Page")
	public void i_landed_on_ecommerce_page() {

		Assert.assertEquals(landingpage.verifytitle(), "Let's Shop");
		LOGGER.info("----- landed on the ecommerce page-----");
	}

	@When("^Logged in with username (.+) and password (.+)$")
	public void logged_in_with_username_and_password(String username, String password) {

		landingpage.loginApplication(username, password);
		LOGGER.info("----- logged in with username and password-----");
	}

	@Then("{string} message is displayed")
	public void message_is_displayed(String errormsg) {

	landingpage.getErrorMessage();
	//Assert.assertFalse(landingpage.validateerrormsg());
	Assert.assertEquals(landingpage.getErrorMessage(),"Incorrect email or password.");
		
		LOGGER.info("----- error msg is displayed-----");
		//System.out.println(errormsg);
	}
}
