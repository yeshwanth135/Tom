package vTiger;

import java.util.concurrent.TimeUnit;

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

public class createcontactwithOrganization extends baseClass {

	@Test
	public void createcontactTest() throws Throwable {
		excelUtility eutil=new excelUtility();
		String firstname=eutil.excelutility("Sheet1", 5, 2)+"_"+javaUtility.genereterandomNumber();
		String lastname=eutil.excelutility("Sheet1", 5, 3)+"_"+javaUtility.genereterandomNumber();
		String searchtype=eutil.excelutility("Sheet1", 5, 4);
		
		//webdriverUtility wutil=new webdriverUtility();
		//propertyfileUtility putil=new propertyfileUtility();
		//String url=putil.propertyfileutility("url");
		//String un=putil.propertyfileutility("username");
		//String pwd=putil.propertyfileutility("password");
		
		//open the browser enter 
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//login to application
		//driver.get(url);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
	//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//create contact with organization
		driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
		WebElement fn=driver.findElement(By.xpath("//select[@name=\"salutationtype\"]"));
		wutil.selectByVisibleText(fn, "Mr.");
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(lastname);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
		Thread.sleep(3000);
		//switch to child window
	     String partialWinTitle="Accounts";
		wutil.switchToWindow(driver, partialWinTitle);
		
		driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys(searchtype);
		driver.findElement(By.xpath("//input[@name=\"search\"]")).click();
		driver.findElement(By.xpath("//a[text()='abc']")).click();
		
		//switch to parent window
		String pwt1="Contacts";
		wutil.switchToWindow(driver, pwt1);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[1]")).click();
	}
}
