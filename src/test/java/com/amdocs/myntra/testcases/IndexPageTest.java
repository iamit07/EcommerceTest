package com.amdocs.myntra.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.myntra.base.BaseClass;
import com.amdocs.myntra.pageobject.IndexPage;
import com.amdocs.myntra.pageobject.signInPage;

public class IndexPageTest extends BaseClass {

	IndexPage currentIndexPage;
	
	  
	 @Test
	    public void loginTest() throws Throwable {
		 currentIndexPage = new IndexPage();
		 currentIndexPage.clickOnSignInBtn();

		 Thread.sleep(10000);
		 System.out.println("Signing");
		 Thread.sleep(10000);
		
	    }

}


