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
import com.vtiger.genericLib.jsonfileUtility;
import com.vtiger.genericLib.propertyfileUtility;
import com.vtiger.genericLib.webdriverUtility;

public class createorganizationwithIndustry extends baseClass {
	
	@Test
	public void createorganizationTest() throws Throwable {
		excelUtility eutil=new excelUtility();
		String orgname=eutil.excelutility("Sheet1", 1, 2)+"_"+javaUtility.genereterandomNumber();
		String indtype=eutil.excelutility("Sheet1", 3, 3);
		
		//propertyfileUtility putil=new propertyfileUtility();
		//String url=putil.propertyfileutility("url");
		//String un=putil.propertyfileutility("username");
		//String pwd=putil.propertyfileutility("password");
		
		//webdriverUtility wutil=new webdriverUtility();
		
		//open the browser
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//login to application
		//driver.get(url);
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(un);
		//driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pwd);
		//driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		
		//create organization with industry
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys(orgname);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		WebElement ind = driver.findElement(By.name("industry"));
		wutil.selectByVisibleText(ind, indtype);
		
		//logout from the application
		//Thread.sleep(4000);
		//WebElement addimg = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		//wutil.mouseOver(driver, addimg);
		//driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
		
		//close the application
		//Thread.sleep(4000);
		//driver.close();
		
		
		
		
		
	}

}
