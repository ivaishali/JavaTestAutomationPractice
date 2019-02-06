package com.amazon.automation.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonSteps {

	public static WebElement findElementByLoc(WebDriver driver, String loc)
	{
//		if()
		WebElement ele = driver.findElement(By.xpath(loc));
		return ele;
	}
	
}
