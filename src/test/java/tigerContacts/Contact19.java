package tigerContacts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.genericLib.propertyfileUtility;
import com.vtiger.genericLib.webdriverUtility;

public class Contact19 {

	
	@Test
	public void contact19() throws Throwable {
		propertyfileUtility putil=new propertyfileUtility();
		String url = putil.propertyfileutility("url");
		String un = putil.propertyfileutility("username");
		String pwd = putil.propertyfileutility("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//login to application
		driver.get(url);
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("(//input[@value=\"Login\"])[2]")).click();
		
		//click on contacts module
		driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
		
		//click on sendmail button
		driver.findElement(By.xpath("//input[@value=\"Send Mail\"]")).click();
		driver.switchTo().alert().accept();	   
		//logout from the application
		webdriverUtility wutil=new webdriverUtility();
		WebElement addimg = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		wutil.mouseOver(driver, addimg);
		driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
		
		//close the application
		Thread.sleep(4000);
		driver.close();
	}
}
