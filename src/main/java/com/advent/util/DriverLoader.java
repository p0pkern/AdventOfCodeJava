package com.advent.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.advent.exceptions.InvalidDriverException;

public class DriverLoader{
	private WebDriver driver;

	public boolean loadDriver(String driverName) throws InvalidDriverException {
		switch(driverName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		default:
			throw new InvalidDriverException(driverName + " is not supported");
		}
		
		return true;
	}

	public void closeDriver() {
		driver.quit();
	}

	public void getUrl(String url) {
		driver.get(url);	
	}

	public WebDriver getDriver() {
		return driver;
	}

}
