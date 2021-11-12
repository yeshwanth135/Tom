package tigerContacts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.genericLib.baseClass;
import com.vtiger.genericLib.propertyfileUtility;
import com.vtiger.genericLib.webdriverUtility;

public class Contact18 extends baseClass{
	
	@Test
	public void contact18() throws Throwable {
		//propertyfileUtility putil=new propertyfileUtility();
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
	    
	    //press on contacts module
	    driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
	    
	    //select one contact from a list of contacts
	    driver.findElement(By.xpath("//a[text()=\"yesh\"]")).click();
	    
	    //select send mails link from actions on the right
	    driver.findElement(By.xpath("//a[text()=\"Send Mail\"]")).click();
	    
	    //click on select button
	    Thread.sleep(4000);
	   driver.findElement(By.xpath("//input[@name=\"semail\"]"));
	    
	    //click on send button
	    driver.findElement(By.xpath("//input[@name=\"Select\"]")).click();
	   
	    //switch to window
	 Thread.sleep(4000);
	 String title="Compose";
	 wutil.switchToWindow(driver, title);
	driver.findElement(By.xpath("//img[@title=\"Select\"]")).click();
     Thread.sleep(4000);
	String titlel = "action";
	 wutil.switchToWindow(driver, titlel);
	 driver.findElement(By.xpath("//a[text()='yesh sun']")).click();
	
	
	    
	    
	    
	    
	    
	    
	}

}
