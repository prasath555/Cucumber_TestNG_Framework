package com.bdd_ecommerce.abstractcomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//this class contains reusable code used again and again-> every page inherits this class
public class AbstractComponent {

	WebDriver driver;

	public AbstractComponent(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

// these elements are present in every page (global)
	@FindBy(css = "[routerlink*='cart']")
	WebElement cartHeader;

	@FindBy(css = "[routerlink*='myorders']")
	WebElement orderHeader;

	@FindBy(css = ".fa.fa-sign-out")
	WebElement logoutbtn;

// wait mechanism-1
	public void waitForElementToAppear(By findBy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));

	}

// wait mechanism-2
	public void waitForWebElementToAppear(WebElement findBy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(findBy));

	}

// wait mechanism-3
	public void waitForElementToDisappear(WebElement ele) throws InterruptedException {
		// Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.invisibilityOf(ele));

	}

// cart header + obj created + return cartpage
	public void goToCartPage() {
		cartHeader.click();

	}

// order page header + obj created + return orderpage
	public void goToOrdersPage() {
		orderHeader.click();

	}

	public void clickLogout() {

		logoutbtn.click();
	}

}
