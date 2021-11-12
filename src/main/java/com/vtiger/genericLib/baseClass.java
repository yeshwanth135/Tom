package com.vtiger.genericLib;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class baseClass {
	
	public WebDriver driver;
	public webdriverUtility wutil=new webdriverUtility();
	public propertyfileUtility putil=new propertyfileUtility();
	public static WebDriver sdriver;
	@BeforeSuite
     public void connecttodatabase() {
		System.out.println("connect to database");
	}
	@BeforeClass
	public void launchbrowser() {
		
		driver=new ChromeDriver();
		sdriver=driver;
		
	}
//	@Parameters("browser")
//	@BeforeClass
//   	public void launchbrowser(String bro) {
//		if(bro.equalsIgnoreCase("chrome")) {
//			driver=new ChromeDriver();
//		}
//		else if(bro.equalsIgnoreCase("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
//			
//	    driver.manage().window().maximize();
//	    wutil.waitForPageLoad(driver);
//	}
	@BeforeMethod
	public void login() throws Throwable {
		propertyfileUtility putil=new propertyfileUtility();
		//driver=new ChromeDriver();
	    String url = putil.propertyfileutility("url");
	    String un=putil.propertyfileutility("username");
	   String pwd=putil.propertyfileutility("password");
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		}
	@AfterMethod
	public void logout() throws InterruptedException {
		WebElement addimg=driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		wutil.mouseOver(driver, addimg);
		driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
	}	
    @AfterClass
	public void closethebrowser() 
    {
        driver.close();
	}
	@AfterSuite
	public void disconnectfromdatabase() {
		System.out.println("disconnect from database");
		}
	
}