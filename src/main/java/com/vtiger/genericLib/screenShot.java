package com.vtiger.genericLib;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.vtiger.genericLib.Listners.class)
public class screenShot extends baseClass {
	
	@Test
	public void screenshot() {
		
		System.out.println(10/0);
	}

}
