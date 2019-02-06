package com.amazon.automation.utils;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Log4JLogGeneration {
	public static void main(String[] args) {
		Logger log = Logger.getLogger(Log4JLogGeneration.class);
		BasicConfigurator.configure();
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.info("launching browser");
	}

}
