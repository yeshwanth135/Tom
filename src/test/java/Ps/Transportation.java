package Ps;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Transportation {
	@Test(dataProvider = "getvalue")
	public void transport(String src) {
		Date date=new Date();
		System.out.println(date);
		//Thu Nov 11 21:42:02 IST 2021
		String d=date.toString();
		String[] arr=d.split(" ");
		String day=arr[0];
		String mon=arr[1];
		String currentdate=arr[2];
		String year=arr[5];
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class=\"loginModal displayBlock modalLogin dynHeight personal \"]")).click();
		driver.findElement(By.xpath("//span[@class=\"langCardClose\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"From\"]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys(src);
	}

}
