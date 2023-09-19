package com.amdocs.myntra.testcases;

import org.testng.annotations.Test;

import com.amdocs.myntra.base.BaseClass;
import com.amdocs.myntra.pageobject.HomePage;
import com.amdocs.myntra.pageobject.IndexPage;
import com.amdocs.myntra.pageobject.signInPage;

public class HomePageTest extends BaseClass {
	
	HomePage currentHomePage;
	signInPage currentsignInPage;
	IndexPage currentIndexPage;
	
	
	  
	 @Test
	    public void HomeSearchTest() throws Throwable {

	        currentIndexPage = new IndexPage();

	        currentsignInPage = currentIndexPage.clickOnSignInBtn();
	        
	       currentHomePage= currentsignInPage.loginClick();
	       
	       currentHomePage.SearchProduct();
	       
	       
	        
	      Thread.sleep(10000);
		 System.out.println("Searched");
		 Thread.sleep(10000);
		
}
}
