package com.bdd_ecommerce.testcomponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.bdd_ecommerce.pageobjects.PageObjectManager;

public class TestContextSetup {

	//public AbstractComponent
	public WebDriver driver;
	public String productName = "ZARA COAT 3";
	public PageObjectManager pageObjectManager;
	public Base base;
	public GenericUtils genericUtils;
	
	
	public TestContextSetup() throws IOException
	{
		base = new Base();
		pageObjectManager = new PageObjectManager(base.initializeDriver());
		genericUtils = new GenericUtils(base.initializeDriver());
		
		
		

	}
}
