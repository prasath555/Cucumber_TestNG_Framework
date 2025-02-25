package com.bdd_ecommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd_ecommerce.abstractcomponents.AbstractComponent;

//common methods available in abstractcomponents so-> inherited using -> EXTENDS
public class LandingPage extends AbstractComponent{

	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
		
	}
		
	//WebElement userEmails = driver.findElement(By.id("userEmail"));
	//PageFactory
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement passwordEle;
	
	@FindBy(id="login")
	WebElement submit;
	
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;

	//Once username+pwd-> correct-> user lands from loginpage to new productpage(<-return)
	public void loginApplication(String email,String password)
	{
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
				
		
	}
	//if credential failed-> remains in same page-> errormessage is acquired->getText->String
	public String getErrorMessage()
	{
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}
	
	public boolean validateerrormsg() {
	
	return errorMessage.isDisplayed();
	
	}
	
	public String verifytitle() {
		
		return driver.getTitle();
		 
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
