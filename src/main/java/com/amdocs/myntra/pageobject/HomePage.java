package com.amdocs.myntra.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.myntra.actiondriver.Action;
import com.amdocs.myntra.base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"search-input-top-bar\"]")
	WebElement searchBar;
	
	@FindBy(xpath="/html/body/span/div[3]/header/div[2]/div[2]/div/div/div/div/form/button")
	WebElement searchSubmitBtn;
	
	@FindBy(xpath="//*[@id=\"product-search-results\"]/div/div[2]/div[6]/div[1]/div/div[1]/div[1]/a/div/div[2]/div/picture/img")
	WebElement firstProduct;
	

	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public AddToCartPage SearchProduct() throws Throwable {
		Thread.sleep(2000);
		
		Action.type(searchBar, "Sneaker");
		Thread.sleep(2000);
		
		Action.click(driver, searchSubmitBtn);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)");
		
		Action.isDisplayed(driver, firstProduct);
		Thread.sleep(2000);
		
		Action.click(driver, firstProduct);
		return new AddToCartPage();		
	}
	

	
}