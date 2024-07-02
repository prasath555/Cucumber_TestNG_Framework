package com.bdd_ecommerce.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd_ecommerce.abstractcomponents.AbstractComponent;


public class CartPage extends AbstractComponent {
	WebDriver driver;

	@FindBy(css = ".totalRow button")
	private WebElement checkoutEle;

	@FindBy(css = ".cartSection h3")
	private List<WebElement> cartProducts;

	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public Boolean VerifyProductDisplay(String productName) {
		Boolean match = cartProducts.stream().anyMatch(product -> product.getText().equalsIgnoreCase(productName));
		return match;

	}

	public void goToCheckout() {
		checkoutEle.click();
		
		

	}

}
