package com.application.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreationPage extends BaseClass{

	public AccountCreationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement continueclickbtn;
	
	public void continueclickbtn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueclickbtn);
		continueclickbtn.click();
	}
	
	
	
}
