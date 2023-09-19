package com.amdocs.myntra.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.myntra.actiondriver.Action;
import com.amdocs.myntra.base.BaseClass;

public class IndexPage extends BaseClass {                                          
	
	@FindBy(xpath="/html/body/span/div[3]/header/div[2]/div[1]/div[2]/a[2]")
	WebElement navToLogin;
	
	
	public IndexPage() 
	{                
		PageFactory.initElements(driver, this);
	}
	
	public signInPage clickOnSignInBtn() throws Throwable
	{
		Action.click(driver,navToLogin);
	return new signInPage();		
	}

}
