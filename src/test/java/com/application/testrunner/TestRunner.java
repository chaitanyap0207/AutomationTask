package com.application.testrunner;


import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	@CucumberOptions
			(
					
					
					features={"G:\\manual testing\\AutomationTestStore_Assignment\\src\\test\\resources\\parallel"},
							glue={"com.application.stepdefinitions"},
							dryRun=false,
							monochrome=true,
					
							plugin={"pretty","html:reports"}
		
			)

	public class TestRunner extends AbstractTestNGCucumberTests {
		
		

	    @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios(); 
	    
	
	} 
}
