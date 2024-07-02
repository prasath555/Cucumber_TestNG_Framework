package com.bdd_ecommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bdd_ecommerce.abstractcomponents.AbstractComponent;

public class PageObjectManager extends AbstractComponent{

	public WebDriver driver;
	public LandingPage landingpage;
	public ProductCataloguePage productcataloguepage;
	public ConfirmationPage confirmationpage;
	public CartPage cartpage;
	public OrderPage orderpage;
	public CheckoutPage checkoutpage;

	public PageObjectManager(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LandingPage getLandingPage() {

		landingpage = new LandingPage(driver);
		return landingpage;
	}

	public ProductCataloguePage getProductCataloguePage() {

		productcataloguepage = new ProductCataloguePage(driver);
		return productcataloguepage;
	}

	public ConfirmationPage getConfirmationPage() {

		confirmationpage = new ConfirmationPage(driver);
		return confirmationpage;

	}

	public CartPage getCartPage() {

		cartpage = new CartPage(driver);
		return cartpage;
	}

	public OrderPage getOrderPage() {

		orderpage = new OrderPage(driver);
		return orderpage;
	}

	public CheckoutPage getCheckOutPage() {
		
		checkoutpage = new CheckoutPage(driver);
		return checkoutpage;
	}
}