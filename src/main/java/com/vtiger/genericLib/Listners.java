package com.vtiger.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
	  String failedtestcasename = result.getMethod().getMethodName();
	                String currentdate = new Date().toString().replace(" ","_").replace(":","_");
//	   EventFiringWebDriver ed=new EventFiringWebDriver(baseClass.sdriver);
	                
	                EventFiringWebDriver ed = new EventFiringWebDriver(baseClass.sdriver);
	   File srcimg = ed.getScreenshotAs(OutputType.FILE);
	   File destimg = new File("./Screenshot/"+failedtestcasename+currentdate+".PNG");
	  
	   try {
		FileUtils.copyFile(srcimg, destimg);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
