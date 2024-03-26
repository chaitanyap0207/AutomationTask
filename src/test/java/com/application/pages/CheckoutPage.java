package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BaseClass {
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[@id='cart_checkout1']")
	WebElement checkoutbtn;
	
	public void checkoutbtn() 
	{
		checkoutbtn.click();
	}
	
	

}
