package com.amdocs.myntra.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.myntra.actiondriver.Action;
import com.amdocs.myntra.base.BaseClass;

public class signInPage extends BaseClass {

	@FindBy(xpath="//*[@id=\"login-form-email\"]")
	WebElement User;
	
	@FindBy(xpath="//*[@id=\"login-form-password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div/div/div[1]/form/button")
	WebElement signInSubmitBtn;
	
	public signInPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginClick() throws Throwable{
		
		Thread.sleep(2000);
		Action.type(User,prop.getProperty("username"));
		
		Thread.sleep(2000);
		Action.type(password,prop.getProperty("password"));
		
		Thread.sleep(2000);
		Action.click(driver,signInSubmitBtn);
		
		Thread.sleep(2000);
		return new HomePage();
		
	}
}
