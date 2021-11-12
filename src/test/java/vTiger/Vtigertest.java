package vTiger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vtiger.genericLib.baseClass;
import com.vtiger.genericLib.excelUtility;
import com.vtiger.genericLib.javaUtility;

public class Vtigertest extends baseClass{
	
	@Test
	public void vtigertest() throws Throwable {
		excelUtility eutil=new excelUtility();
		String orgname=eutil.excelutility("Sheet1", 1, 2)+"_"+javaUtility.genereterandomNumber();
		
	}

}
