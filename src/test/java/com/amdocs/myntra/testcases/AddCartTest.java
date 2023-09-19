package com.amdocs.myntra.testcases;

import org.testng.annotations.Test;

import com.amdocs.myntra.base.BaseClass;
import com.amdocs.myntra.pageobject.AddToCartPage;
import com.amdocs.myntra.pageobject.HomePage;
import com.amdocs.myntra.pageobject.IndexPage;
import com.amdocs.myntra.pageobject.signInPage;

public class AddCartTest extends BaseClass {

	HomePage currentHomePage;
	signInPage currentsignInPage;
	IndexPage currentIndexPage;
	AddToCartPage currentAddToCartPage;
	
	@Test
	public void AddCart() throws Throwable {

		   currentIndexPage = new IndexPage();

	        currentsignInPage = currentIndexPage.clickOnSignInBtn();
	        
	       currentHomePage= currentsignInPage.loginClick();
	       
	       currentAddToCartPage= currentHomePage.SearchProduct();
	       
	       currentAddToCartPage.AddCart();
       
}
}
