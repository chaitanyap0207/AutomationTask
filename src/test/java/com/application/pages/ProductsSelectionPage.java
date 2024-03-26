package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsSelectionPage extends BaseClass{

	public ProductsSelectionPage(WebDriver driver) {
		super(driver);
		
	}
		@FindBy(xpath="//div[contains(@class,'fixed_wrapper')]//a[contains(@title,'ck One Gift Set')]")
		WebElement creambtn;
		
		
		public void creambtn() 
		{
			
			creambtn.click();
			
		}
	
		public String title() {
			String title= creambtn.getText();
			return title;
		}
		
		
}
