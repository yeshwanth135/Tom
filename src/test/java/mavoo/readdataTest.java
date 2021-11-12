package mavoo;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class readdataTest {
	
	@Test
	public void readdataTest() throws Throwable {
		
		
		FileInputStream fis=new FileInputStream("./data/common.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String url=prop.getProperty("url");
		String browser=prop.getProperty("browser");
		String password=prop.getProperty("password");
		String timeout=prop.getProperty("timeout");
		String username=prop.getProperty("username");
		
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(password);
		System.out.println(timeout);
		System.out.println(username);
	}

}
