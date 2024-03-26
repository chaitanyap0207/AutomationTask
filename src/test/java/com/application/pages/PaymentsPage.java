package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsPage extends BaseClass{
	
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
	
	public String orderitem() {
		
		String nameorderitem= orderitem.getText();
		
		return nameorderitem;		
	}
	
	public String cartitem()
	{
		String namecartitem= cartitem.getText();
		return namecartitem;
	}
	
	public String orderprice()
	{
		String ordervalue= orderprice.getText();
		return ordervalue;
	}
	public String cartprice()
	{
		String cartvalue=cartprice.getText();
		return cartvalue;
	}
	

}
