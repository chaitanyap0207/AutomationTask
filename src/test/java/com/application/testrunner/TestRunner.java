package com.application.testrunner;


import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	@CucumberOptions
			(
					
					
					features={"G:\\manual testing\\AutomationTestStore_Assignment\\src\\test\\resources\\FeatureFiles"},
							glue={"com.application.stepdefinitions"},
							dryRun=false,
							monochrome=true,
					
							plugin={"pretty","json:target/cucumber-reports/cucumber.json",
									"html:target/cucumber-reports/cucumberreport.html",
									}
		
			)

	public class TestRunner extends AbstractTestNGCucumberTests {
		
		

	  
	
	
}
