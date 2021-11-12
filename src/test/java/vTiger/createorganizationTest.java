package vTiger;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genericLib.baseClass;
import com.vtiger.genericLib.excelUtility;
import com.vtiger.genericLib.javaUtility;
import com.vtiger.genericLib.propertyfileUtility;
import com.vtiger.genericLib.webdriverUtility;

public class createorganizationTest extends baseClass {
	
	@Test
	public void createorganizationTest() throws Throwable{
		
		excelUtility eutil=new excelUtility();
		String orgname=eutil.excelutility("Sheet1", 1, 2)+"_"+javaUtility.genereterandomNumber();
	//	webdriverUtility wutil=new webdriverUtility();
		//propertyfileUtility putil=new propertyfileUtility();
	    //String url = putil.propertyfileutility("url");
	    //String un=putil.propertyfileutility("username");
	   // String pwd=putil.propertyfileutility("password");
	    
	    //open the browser
	    //WebDriver driver=new ChromeDriver();
	    //driver.manage().window().maximize();
	    //wutil.waitForPageLoad(driver);
	    
	    //login into the application
	    //driver.get(url);
	    //driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(un);
	    //driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pwd);
	    //driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
	    
	    //create organization
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[text()=\"Organizations\"])[1]")).click();
	    driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();
	    driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys(orgname);
	    driver.findElement(By.xpath("(//input[@type=\"button\"])[3]")).click();
	    Reporter.log("Organisation Created");
	    
	    WebElement orginfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
	    String organizationinfo=orginfo.getText();
	    System.out.println(organizationinfo);
	    Assert.assertTrue(organizationinfo.contains(orgname));
	    Reporter.log("verificationpassed ", true);
	    
	    //logout from the application
	    Thread.sleep(4000);
	   // WebElement  img=driver.findElement(By.xpath("//img[@style=\"padding: 0px;padding-left:5px\"]"));
	   // wutil.mouseOver(driver, img);
	   // driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();

	   //close the connection
	    //driver.close();
	}
	

}
