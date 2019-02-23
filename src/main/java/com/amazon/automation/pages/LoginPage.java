package com.amazon.automation.pages;

import java.io.File;

import javax.swing.text.Document;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class LoginPage extends TestBase{
// page factory - Object Repo.
	
	@FindBy(xpath="//h1")
	WebElement loginpageTitleLbl;
	
	@FindBy(id="ap_email")
	static WebElement emailInput;
	
	@FindBy(css="input#continue")
	static WebElement continurBtn;
	
	@FindBy(id="ap_password")
	static WebElement passwordInput;
	
	@FindBy(id="signInSubmit")
	static WebElement loginBtn;
	
	//initialization
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//	action methods: 
	public boolean navigateToLoginPage(){
		Homepage page = new Homepage();
		page.signinBtnOnHomePage.click();
		return loginpageTitleLbl.isDisplayed();
	}
	
	public Homepage login(String emailid, String password){
		emailInput.clear();
		emailInput.sendKeys(emailid);
		continurBtn.click();
		passwordInput.clear();
		passwordInput.sendKeys(password);
		loginBtn.click();
		return new Homepage();
	}
}
