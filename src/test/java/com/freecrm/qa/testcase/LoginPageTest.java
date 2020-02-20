package com.freecrm.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.BaseClass;
import com.freecrm.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass{
	LoginPage loginPage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void isVerifyLogoImgTest() {
	Assert.assertTrue(loginPage.verifyLogoImg());	
	}
	
	@Test(priority = 2)
	public void isDoSendInfoTest() {
		loginPage.doSendInfo(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
