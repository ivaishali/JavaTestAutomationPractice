package com.amazon.automation.pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class RegistrationPage extends TestBase {

	public RegistrationPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	public WebElement userid;
	
	public Homepage registerUser() {
		
		return new Homepage();
	}
}
