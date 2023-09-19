package com.amdocs.myntra.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.amdocs.myntra.actiondriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
   
	public static Properties prop;
	
	@BeforeSuite
	public void loadConfig() {
		
		try {
            prop=new Properties();
            
            System.out.println("super construtor invoked");
            
            FileInputStream ip=new FileInputStream("D:\\AmdocsAQE\\EcommerceProject\\Configuration\\Config.properties");
           
            prop.load(ip);
            
            System.out.println("driver : "+driver);
           
		}
        catch(FileNotFoundException e)
        {
            e.printStackTrace();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
	}
	
	@BeforeTest
	public static void launchApp() throws IOException
	{
		WebDriverManager.edgedriver().setup();
		
        String browserName=prop.getProperty("browser");
        
        System.out.println("browser is- "+browserName);
        
        if(browserName.contains("Chrome"))
        {
            driver=new ChromeDriver();
        } 
        else if(browserName.contains("Edge"))
        {
            driver=new EdgeDriver();
        }
        else if(browserName.contains("FireFox"))
        {
            driver=new FirefoxDriver();
        }
        else if(browserName.contains("IE"))
        {
            driver=new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        
        driver.manage().deleteAllCookies();
        
//        System.out.println(prop.getProperty("url")+driver);
        
        driver.get(prop.getProperty("url"));
		
	}

}
