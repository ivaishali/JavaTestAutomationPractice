package com.amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.amazon.automation.utils.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties property;
	public TestBase() {
		property = new Properties();
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(
					".\\src\\resource\\common\\application.properties");
			property.load(fileInputStream);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initalization() {
		String browser = property.getProperty("browser");
		System.setProperty("webdriver." + browser + ".driver",".\\"+property.getProperty("webdriver." + browser + ".driver"));

		if (browser.contains("chrome")) {
			 driver = new ChromeDriver();
		}
		else if(browser.contains("firefox")) {
			 driver = new FirefoxDriver();
		}
		else if(browser.contains("ie")) {
			 driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("you havn't declared listed driver here");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.MILLISECONDS);
		driver.get(property.getProperty("base.url"));
	}
	
}
