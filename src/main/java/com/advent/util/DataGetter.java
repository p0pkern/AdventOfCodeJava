package com.advent.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataGetter {
	
	public String getExampleData(WebDriver driver, String path) {
		String text = driver.findElement(By.xpath(path)).getText();
		return text;
	}
}
