package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//*[contains(text(),'User: Raman k')]")
	@CacheLookup
	WebElement userLoggedIn;
	
	@FindBy(xpath = "//ul//*[contains(text(),'Contacts') and @title='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath = "//*[@class='linkStyle']//a[contains(text(),'Upgrade your account')]")
	WebElement upgradeLink;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyLoggedUser() {
		boolean loggedin = userLoggedIn.isDisplayed();
		return loggedin;
	}
	
	public void verifyContactsLink() {
		contactsLink.click();
	}
	
	

}
