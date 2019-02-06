package com.amazon.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.apache.log4j.lf5.viewer.configure.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadProperties {
	public static void main(String[] args) throws IOException {
		Properties property = new Properties();
		FileInputStream fileInputStream = new FileInputStream(
				".\\src\\resource\\common\\application.properties");
		property.load(fileInputStream);
		property.getProperty("base.url");
		System.out.println(property.getProperty("base.url"));
		String browser = property.getProperty("browser");
		System.out.println("webdriver." + browser + ".driver");
		System.setProperty("webdriver." + browser + ".driver",".\\"+property.getProperty("webdriver." + browser + ".driver"));
		WebDriver driver = null;
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

		driver.get(property.getProperty("base.url"));
		
	}
}
