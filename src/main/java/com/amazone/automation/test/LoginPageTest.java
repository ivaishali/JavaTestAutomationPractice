package com.amazone.automation.test;

import java.util.Properties;

import org.dom4j.DocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.automation.pages.Homepage;
import com.amazon.automation.pages.LoginPage;
import com.amazon.base.TestBase;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	Homepage page;
	public LoginPageTest() {
	super();
	}
	
	@BeforeMethod
	public void setup() {
		initalization();
		loginPage = new LoginPage();
	}
	

	
	@Test(priority=1)
	public Homepage loginFunctionalityTest() throws DocumentException {
		page=loginPage.login("Vaishalihthacker49@gmail.com","Vaishali49");
		return new Homepage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
