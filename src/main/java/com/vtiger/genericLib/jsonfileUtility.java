package com.vtiger.genericLib;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;
import org.testng.xml.Parser;

public class jsonfileUtility {
	
	@Test
	public String jsonfileutility(String key) throws Throwable {
		FileReader fr=new FileReader(ipathConstant.jsonfilepath);
	    JSONParser par = new JSONParser();
	    Object jobj = par.parse(fr);
	    HashMap obj = (HashMap)jobj;
	       Object value = obj.get(key);
	       return (String) value;
	    
	}

}
