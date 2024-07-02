package com.bdd_ecommerce.Stepdefinitions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.bdd_ecommerce.pageobjects.ProductCataloguePage;
import com.bdd_ecommerce.testcomponents.TestContextSetup;

import io.cucumber.java.en.When;

public class ProductCataloguePageSteps {

	private static final Logger LOGGER = Logger.getLogger(ProductCataloguePageSteps.class);
	TestContextSetup testcontextsetup;
	ProductCataloguePage productcataloguepage;

	public ProductCataloguePageSteps(TestContextSetup testcontextsetup) {

		this.testcontextsetup = testcontextsetup;
		productcataloguepage = testcontextsetup.pageObjectManager.getProductCataloguePage();
	}

	@When("^I add product (.+) to Cart$")
	public void i_add_product_to_cart(String productName) throws InterruptedException {
	

		List<WebElement> products = productcataloguepage.getProductList();
		LOGGER.info("----- product is filtered from list-----");
		productcataloguepage.addProductToCart(productName);
		LOGGER.info("-----added to cart-----");
		productcataloguepage.goToCartPage();
		LOGGER.info("----- reached cartpage from product page-----");
	
	}

	
}
