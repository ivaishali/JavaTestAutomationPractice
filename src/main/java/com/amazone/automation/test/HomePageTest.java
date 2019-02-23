package com.amazone.automation.test;

import static com.amazon.base.TestBase.property;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.automation.pages.Homepage;
import com.amazon.automation.pages.LoginPage;
import com.amazon.base.TestBase;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	Homepage homepage;
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initalization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public LoginPage navigateToLOginPage() {
		loginPage.navigateToLoginPage();
		return new LoginPage();
	}
	
	@Test(priority=2)
	public void loginFromHomePage() {
		homepage=loginPage.login(property.getProperty("useremail"), property.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
