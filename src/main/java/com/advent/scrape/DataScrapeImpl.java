package com.advent.scrape;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.advent.exceptions.FailedToFindDataException;
import com.advent.exceptions.FailedToOpenUrlException;

public class DataScrapeImpl implements DataScrape {
	private static final Logger LOGGER = LoggerFactory.getLogger(DataScrapeImpl.class);
	private WebDriver driver;
	private String url;
	private String example;
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

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
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
	
	/*
	 * Each problem is provided with an example input. To test the 
	 * code this will pull that example input data.
	 */
	public List<String> getExampleData() {
		List<String> exampleProblem = null;
		try {
			LOGGER.info("Attempting to extract example data");
			driver.get(url);
			String text = driver.findElement(By.xpath(getExample())).getText();
			String[] elements = text.split(" ");
			
			exampleProblem = Arrays.stream(elements).collect(Collectors.toList());
			
			LOGGER.info("Success");
		} catch(Exception e) {
			throw new FailedToFindDataException("Could not pull example test data from website");
		}
		
		return exampleProblem;
	}

	public List<String> getProblemData() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void quit() {
		driver.quit();
	}

}
