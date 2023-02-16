package com.advent.scrape;

public interface DriverLoader {
	public void loadDriver(String driverName);
	public void closeDriver();
	public void getUrl(String url);
}
