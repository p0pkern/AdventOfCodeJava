package com.advent.util;

import org.openqa.selenium.WebDriver;

import com.advent.exceptions.InvalidDriverException;

public interface DriverLoader {
	public boolean loadDriver(String driverName) throws InvalidDriverException;
	public void closeDriver();
	public WebDriver getDriver();
	public void getUrl(String url);
}
