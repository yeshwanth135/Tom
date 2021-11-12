
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class createOrganization {
	
	@BeforeSuite
	public void connecttoDatabase() {
		System.out.println("connect to database");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch the browser");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login to the application");
	}

	

	@Test
	public void createOrganization() {
		System.out.println("create organization");
	}
	@Test
	public void mofifyOrganization() {
		System.out.println("modify the organization");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout from the application");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("close the browser");
	}
	
	@AfterSuite
	public void disconnectfromDatabase() {
		System.out.println("disconnected from batabase");
	}
	
}
