package com.amdocs.myntra.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.myntra.actiondriver.Action;
import com.amdocs.myntra.base.BaseClass;

public class AddToCartPage extends BaseClass {
	
	
	@FindBy(xpath="//*[@id=\"size-ul-list\"]/li[5]")
	WebElement selectsize;
     
	@FindBy(xpath="//*[@id=\"maincontent\"]/div/div[1]/div[2]/div[5]/div[4]/div[1]/div/div/button")
			WebElement Addtobag;
	
	@FindBy(xpath="//*[@id=\"minicartIcon\"]")
	WebElement ViewCart;
	
	@FindBy(xpath="//*[@id=\"cart-page-checkout-btn\"]")
	WebElement Proceed;
	
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void AddCart() throws Throwable
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(2000);
		
		Action.click(driver, selectsize);
		System.out.println("size slected");
		Thread.sleep(2000);
		
		Action.click(driver, Addtobag);
		System.out.println("add to bag");
		Thread.sleep(10000);
		
		Action.click(driver, ViewCart);
		System.out.println("View Cart");
		Thread.sleep(4000);
		
		Action.click(driver, Proceed);
		System.out.println("Proceeded");
		js.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(2000);
		
	}
}
