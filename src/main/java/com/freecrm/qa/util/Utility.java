package com.freecrm.qa.util;

import com.freecrm.qa.base.BaseClass;

public class Utility extends BaseClass{

	public static long PageLoadTimeout = 20;
	public static long ImplicitlyWait = 10;
	public static void switchTo() {
		
		driver.switchTo().frame("mainpanel");
	}
}
