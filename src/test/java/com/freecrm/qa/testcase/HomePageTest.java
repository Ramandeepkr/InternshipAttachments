package com.freecrm.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.BaseClass;
import com.freecrm.qa.pages.HomePage;
import com.freecrm.qa.pages.LoginPage;
import com.freecrm.qa.util.Utility;

public class HomePageTest extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		loginPage.doSendInfo(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void verifyLoggedUserTest() {
		boolean loggedIn = homePage.verifyLoggedUser();
		Assert.assertTrue(loggedIn);
		
	}
	@Test
	public void verifyContactsLink() {
		Utility.switchTo();
		homePage.verifyContactsLink();
	}

}
