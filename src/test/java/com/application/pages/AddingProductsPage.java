package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddingProductsPage extends Baseclass {

	
	public AddingProductsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//*[contains(@id,'customer_menu_top')]//a[contains(@href,'account/login')]")
			// "//a[normalize-space()='Login or register']")
	WebElement loginclk1btn;
	
	@FindBy(id="loginFrm_loginname")
	WebElement usernamebtn;
	
	@FindBy(name="password")
	WebElement passwordbtn;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//span[@class='subtext']")
	WebElement accountverifybtn;
	
	@FindBy(xpath=("//input[@id='filter_keyword']"))
	WebElement searchbtn;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement clkbtn;
	
	
	// click on loginclick button
	public void loginclk1btn() 
	{
		loginclk1btn.click();
	}
	
	// Enter the username details	
	public void usernamebtn(String Username) 
	{
		
		usernamebtn.sendKeys(Username);
	}
	
	//Enter the password details
	public void passwordbtn(String password)
	{
		passwordbtn.sendKeys(password);
	}
	
	//click on login button
	public void loginbtn() 
	{
		loginbtn.click();
	}
	
	// verifying the name Text of username
	public String accountverifybtn() {
		
		String accountname= accountverifybtn.getText();
		return accountname;
		
	}
	
	// search for the required item
	public void addingproductbtn() 
	{
		searchbtn.click();
		searchbtn.sendKeys("men cream");
		clkbtn.click();
		
	
	}

}
