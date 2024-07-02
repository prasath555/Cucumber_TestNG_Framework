package com.bdd_ecommerce.Runnerclass;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions

(
		features="src/test/resources/cucumber",
		glue="com/bdd_ecommerce/Stepdefinitions",
		monochrome=true,
		dryRun=false,
        tags = "@ErrorValidation",
        plugin= {"html:target/cucumber.html", 
        		"json:target/cucumber.json",
        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class TestNGTestRunner extends AbstractTestNGCucumberTests{


	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}
