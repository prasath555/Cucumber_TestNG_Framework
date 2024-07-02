package com.bdd_ecommerce.testcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver;
	private static final Logger LOGGER = Logger.getLogger(Base.class);

	

	public WebDriver initializeDriver() throws IOException 
	{

		PropertyConfigurator.configure("log4j.properties");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "//src//main//java//com//bdd_ecommerce//resources//GlobalData.properties");
		
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("URL");


		if(driver == null)
		{
		if (browserName.equalsIgnoreCase("chrome")) // chrome
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("firefox")) // Firefox
		{
			System.setProperty("Webdriver.gecko.driver", ("user.dir") + "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("edge")) // Edge
		{
			System.setProperty("Webdriver.edge.driver", ("user.dir") + "/drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}

		LOGGER.info("----- browser selected from properties -----");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get(url);
		LOGGER.info("----- landed in the rwquired url -----");	
	}	
	return driver;
}
}