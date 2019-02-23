package com.amazon.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazone.automation.test.LoginPageTest;

public class Homepage extends TestBase{
	
	@FindBy(id="nav-link-yourAccount")
	public
	WebElement signinBtnOnHomePage;
	
	@FindBy(xpath="//span[contains(text(),'Hello')]")
	WebElement usernameAfterLogin;
	
	@FindBy(id="nav-logo")
	WebElement amazoneLogo;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public Homepage clickOnLogo() {
		amazoneLogo.click();
		return new Homepage();
	}
	
}
