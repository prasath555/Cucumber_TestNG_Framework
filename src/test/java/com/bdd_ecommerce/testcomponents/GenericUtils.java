package com.bdd_ecommerce.testcomponents;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	WebDriver driver;
	
	
	// constructor to intialize + pagefactory to initialize webelements
	public GenericUtils(WebDriver driver) {

		this.driver = driver;
	}
}