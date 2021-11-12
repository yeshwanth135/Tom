package vTiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.genericLib.baseClass;
import com.vtiger.genericLib.javaUtility;

public class organizationName extends baseClass{

	@Test
	public void name() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunny\\eclipse-workspace\\mavoo\\drivers\\chromedriver.exe");
        //WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.get("http://localhost:8888/index.php?action=index&module=Home");
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
        //driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
        //driver.findElement(By.xpath("(//input[@value=\"Login\"])[2]")).click();
        driver.findElement(By.xpath("(//a[text()=\"Organizations\"])[1]")).click();
        driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys("AAa"+javaUtility.genereterandomNumber());
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[1]")).click();
        Thread.sleep(5000);
        //Actions ac=new Actions(driver);
        //WebElement icon=driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
        //ac.moveToElement(icon).perform();
        //driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();    
	
	
	
	
	}
}
