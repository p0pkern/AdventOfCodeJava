package com.advent.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.advent.exceptions.FailedToFindDataException;

public class DataGetter {
	
	public String getExampleData(WebDriver driver, String path) {
		String text = null;
		try {
			text = driver.findElement(By.xpath(path)).getText();
		} catch (Exception e){
			throw new FailedToFindDataException("Path does not lead to data");
		}
		
		return text;
	}
}
