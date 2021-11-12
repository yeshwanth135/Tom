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

public class Contact16 extends baseClass {
	
	@Test
	public void contact16() throws Throwable {
	
//	propertyfileUtility putil=new propertyfileUtility();
	//String url=putil.propertyfileutility("url");
	//String un=putil.propertyfileutility("username");
	//String pwd=putil.propertyfileutility("password");
  
	//openthe browser 
	//WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//login to application
	//driver.get(url);
	//driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(un);
	//driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pwd);
	//driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
	
	//click on contacts link
	driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
	
	//click on last viewed contacts image
	driver.findElement(By.xpath("//img[@alt=\"Last Viewed\"]")).click();
	
	//logout fron the application
//	Thread.sleep(4000);
//	WebElement addimg = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
//	webdriverUtility wutil=new webdriverUtility();
//	wutil.mouseOver(driver, addimg);
//	driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
	
	//close the application
	//Thread.sleep(4000);
	//driver.close();
	}
}
