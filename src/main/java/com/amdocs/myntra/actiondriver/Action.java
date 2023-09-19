package com.amdocs.myntra.actiondriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amdocs.myntra.base.BaseClass;

public class Action extends BaseClass {
	
	public static void scroll(WebDriver driver,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView();",ele);
		
		
	}
	
	public static void click(WebDriver ldriver,WebElement locatorName) {
		
		Actions act=new Actions(ldriver);
		act.moveToElement(locatorName).click().build().perform();
	}
	
	@SuppressWarnings("finally")
	public static boolean findElement(WebDriver ldriver,WebElement ele) {
		boolean flag=false;
		try {
			ele.isDisplayed();
			flag=true;
			}catch(Exception e) {
				flag=false;
			}
		
		finally {
				if(flag) {
					System.out.println("Successfully found the element at");
				}else {
					System.out.println("Unable to locate the element at");
				}
				return flag;
			}
	}
	
	public static boolean isDisplayed(WebDriver ldriver,WebElement ele) {
		boolean flag=false;
		flag=findElement(ldriver,ele);
		if(flag) {
			flag=ele.isDisplayed();
			if(flag) {
				System.out.println("The element is displayed");
			}else {
				System.out.println("The element is not displayed");
			}
		}else {
			System.out.println("Not Displayed");
		}
		return flag;
	}
	
	public static boolean type(WebElement ele,String text) throws Throwable {
		boolean flag =false;
		try{
			flag=ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag=true;
		} catch (Exception e) {
			System.out.println("Location not found");
			flag=false;
		}finally {
			if(flag) {
				System.out.println("Successfully enetered value");	
			}else {
				System.out.println("unable to enter value");
			}
		}
		return flag;
	}
    
}
