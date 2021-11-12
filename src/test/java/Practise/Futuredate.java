package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Futuredate {

	private static Object close;

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//div[@class=\"loginModal displayBlock modalLogin dynHeight personal \"]")).click();
		      driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable((By) close)).click();
		
		
		//		driver.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();
//		driver.findElement(By.xpath("//span[text()=\"DEPARTURE\"]")).click();
//		try
//		{
//			for(int i=1; i<=11;i++)
//			{
//				
//			driver.findElement(By.xpath("//div[@aria-label=\"Sat Apr 02 2022\"]")).click();
//			break;
//			}
//			
//		}
//		catch (Exception e) {
//			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
//			Thread.sleep(2000);
//			
//		}
//		
		//driver.close();
	}
	 
	 
}
