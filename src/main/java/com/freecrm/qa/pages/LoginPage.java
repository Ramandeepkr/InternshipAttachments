package com.freecrm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.BaseClass;

public class LoginPage extends BaseClass{
	
	//Object repository
	@FindBy(xpath="//a[@class='navbar-brand']//img[@class='img-responsive']")
	WebElement imgLogo;
	
	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement passWord;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement loginBtn;
	
	
	//Constructor initialization
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public boolean verifyLogoImg() {
		boolean visibility = imgLogo.isDisplayed();
		return visibility;
	}
	public String verifyTitle() {
		return driver.getTitle();
	}
	public HomePage doSendInfo(String un, String pwd) {
		userName.sendKeys(un);
		passWord.sendKeys(pwd);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("argument[0].click();",loginBtn);
		
		return new HomePage();
	}
	
	
}
