package com.vtiger.genericLib;

import java.util.Random;

public class javaUtility {
	
	public static int genereterandomNumber() {
	   Random r = new Random();
	   int number=r.nextInt(10000);
	   return number;
	}

}
