package com.amdocs.myntra.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.myntra.base.BaseClass;
import com.amdocs.myntra.pageobject.HomePage;
import com.amdocs.myntra.pageobject.IndexPage;
import com.amdocs.myntra.pageobject.signInPage;

public class SignInTest extends BaseClass {
	signInPage currentsignInPage;
	IndexPage currentIndexPage;
	
	
	  
	 @Test
	    public void loginTest() throws Throwable {

	        currentIndexPage = new IndexPage();

	        currentsignInPage = currentIndexPage.clickOnSignInBtn();
	        
	        currentsignInPage.loginClick();
		
	        Thread.sleep(10000);
		 System.out.println("Signed");
		 Thread.sleep(10000);
		
	    }


}
