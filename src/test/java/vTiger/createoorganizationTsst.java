package vTiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.genericLib.baseClass;
import com.vtiger.genericLib.excelUtility;
import com.vtiger.genericLib.javaUtility;
import com.vtiger.genericLib.propertyfileUtility;
import com.vtiger.genericLib.webdriverUtility;

public class createoorganizationTsst extends baseClass {

	@Test
	public void createorganozationTest() throws Throwable {
//		webdriverUtility wutil=new webdriverUtility();
		excelUtility eutil=new excelUtility();
		String orgname= eutil.excelutility("Sheet1", 1, 2)+"_"+javaUtility.genereterandomNumber();
        
	//	propertyfileUtility putil=new propertyfileUtility();
		//String url=putil.propertyfileutility("url");
		//String un=putil.propertyfileutility("username");
		//String pwd=putil.propertyfileutility("password");
		
		//open the browser 
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//wutil.waitForPageLoad(driver);
		
		//login to the application
		//driver.get(url);
		//driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(un);
		//driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pwd);
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//create organization
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
        driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys(orgname);
        driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
        
        //logout from the application
        Thread.sleep(4000);
      //  WebElement addimg=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
        //wutil.mouseOver(driver, addimg);
        //driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
        
        //close the connection
        //Thread.sleep(4000);
        //driver.close();
	}
}
