package com.advent.scrape;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.advent.exceptions.FailedToOpenUrlException;

public class DataScrapeImpl implements DataScrape {
	private static final Logger LOGGER = LoggerFactory.getLogger(DataScrapeImpl.class);
	private WebDriver driver;
	private String url;
	private String data;
	private String problem;

	public DataScrapeImpl() {
		driver = new ChromeDriver();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}
	
	/*
	 * Navigates to the selected problem page for parsing of data.
	 */
	public void openProblem() {
		try {
			LOGGER.info("Attempting to open URL: {}", getUrl());
			driver.get(getUrl());
			LOGGER.info("Success!");
		} catch (Exception e){
			throw new FailedToOpenUrlException("Cannot load given Url");
		}
		
	}

	public String getExampleData() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProblemData() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void quit() {
		driver.quit();
	}

}
