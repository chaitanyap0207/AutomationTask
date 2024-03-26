package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PaymentsPage extends Baseclass{
	
public PaymentsPage(WebDriver driver) {
		
		super(driver);
	}

	@FindBy(xpath="//td[@class='align_left valign_top']//a[contains(text(),'ck One Gift Set')]")
	WebElement orderitem;
	
	@FindBy(xpath="//a[@class='checkout_heading']")
	WebElement cartitem;
	
	@FindBy(xpath="//b[normalize-space()='$36.00']")
	WebElement orderprice;
	
	@FindBy(xpath="(//td[contains(text(),'$36.00')])[2]")
	WebElement cartprice;
	
	// To get name of order item
	public String orderitem() {
		
		String nameorderitem= orderitem.getText();
		
		return nameorderitem;		
	}
	
	// To get name of cart item
	public String cartitem()
	{
		String namecartitem= cartitem.getText();
		return namecartitem;
	}
	
	// To get the item price of order placed
	public String orderprice()
	{
		String ordervalue= orderprice.getText();
		return ordervalue;
	}
	
	// To get the cart price of item in cart
	public String cartprice()
	{
		String cartvalue=cartprice.getText();
		return cartvalue;
	}
	

}
