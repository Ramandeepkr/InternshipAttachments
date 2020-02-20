package com.freecrm.qa.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.freecrm.qa.pages.ContactsPage;
import com.freecrm.qa.util.ExcelUtil;

public class ContactsPageTest {
	
	@DataProvider
	public Object[][] getContactsData() {
		Object[][] data = ExcelUtil.getExcelData("SheetName");
		return data;
	}
	
	@Test(dataProvider = "getContactsData")
	public void getContactDataTest(String firstname,String middleName,String LastName) {
		//ContactsPage.getContactsPage(firstname,middleName,LastName);
		
	}
	

}
