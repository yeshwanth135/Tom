package Ps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class=\"loginModal displayBlock modalLogin dynHeight personal \"]")).click();
		driver.findElement(By.xpath("//span[@class=\"langCardClose\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"DEPARTURE\"]")).click();
		
		try {
			for(int i=1;i<=11;i++) {
				driver.findElement(By.xpath("//div[@aria-label=\"Sat Jun 04 2022\"]")).click();
				break;
			
		
			}
		}
		catch (Exception e) {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
		}
	}
}
