package com.advent.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.advent.exceptions.InvalidDriverException;

public class DriverLoaderImpl implements DriverLoader{
	private WebDriver driver;

	@Override
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

	@Override
	public void closeDriver() {
		driver.quit();
	}

	@Override
	public void getUrl(String url) {
		driver.get(url);	
	}

	@Override
	public WebDriver getDriver() {
		return driver;
	}

}
