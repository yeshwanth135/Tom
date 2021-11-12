package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class propertyfileUtility {
	
	@Test
	public String propertyfileutility(String key) throws Throwable  {
		FileInputStream fis=new FileInputStream(ipathConstant.Propertyfilepath);
        Properties prop=new Properties();
        prop.load(fis);
        String value=prop.getProperty(key);
        return value;
        
	}

}
