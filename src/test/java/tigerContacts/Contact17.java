package tigerContacts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.genericLib.baseClass;
import com.vtiger.genericLib.propertyfileUtility;
import com.vtiger.genericLib.webdriverUtility;

public class Contact17 extends baseClass{
	
	@Test
      public void contact17() throws Throwable {
    	//  propertyfileUtility putil=new propertyfileUtility();
    	  //String url = putil.propertyfileutility("url");
    	  //String username = putil.propertyfileutility("username");
    	  //String password = putil.propertyfileutility("password");
    	  
    	  //WebDriver driver=new ChromeDriver();
    	  //driver.manage().window().maximize();
    	  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	  
    	  //login to application
    	  //driver.get(url);
    	  //driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(username);
    	  //driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(password);
    	  //driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
    	  
    	  //click on contacts module
    	  driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
    	  
    	  //open one contact
    	  driver.findElement(By.xpath("//a[text()=\"hh\"]")).click();
    	  
    	  //click on duplicate button
    	  driver.findElement(By.xpath("(//input[@name=\"Duplicate\"])[1]")).click();
    	  
    	  //click on save button
    	  driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[1]")).click();
    	  
    	  //logout from the application
    	  //webdriverUtility wutil=new webdriverUtility();
    	  //WebElement add = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
    	  //wutil.mouseOver(driver, add);
    	  //driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
    	  
    	//  Thread.sleep(4000);
    	 // driver.close();
      }
}
