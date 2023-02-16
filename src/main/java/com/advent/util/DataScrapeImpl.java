package com.advent.util;

import java.util.ArrayList;
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

public class DataScrapeImpl {
//	private static final Logger LOGGER = LoggerFactory.getLogger(DataScrapeImpl.class);
//	private WebDriver driver;
//	private String dayUrl;
//	private String exampleDataPath;
//	private String linkToProblemData;
//	private String problemDataPath;
//	
//	public DataScrapeImpl(String dayUrl, String exampleDataPath, String linkToProblemData, String problemDataPath) {
//		driver = new ChromeDriver();
//		
//	}
//	
//	public String getProblemUrl() {
//		return problemUrl;
//	}
//
//	public void setProblemUrl(String problemUrl) {
//		this.problemUrl = problemUrl;
//	}
//
//	public String getUrl() {
//		return url;
//	}
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
//
//	public String getExample() {
//		return example;
//	}
//
//	public void setExample(String example) {
//		this.example = example;
//	}
//
//	public String getProblem() {
//		return problem;
//	}
//
//	public void setProblem(String problem) {
//		this.problem = problem;
//	}
//	
//	/*
//	 * Navigates to the selected problem page for parsing of data.
//	 */
//	public void openProblem() {
//		try {
//			LOGGER.info("Attempting to open URL: {}", getUrl());
//			driver.get(getUrl());
//			LOGGER.info("Success!");
//		} catch (Exception e){
//			throw new FailedToOpenUrlException("Url path to problem is not loading.");
//		}
//		
//	}
//	
//	@Override
//	public void openProblemData() {
//		try {
//			LOGGER.info("Attempting to open problem data: {}", getProblemUrl());
//			driver.get(getUrl());
//			driver.findElement(By.xpath("/html/body/main/p[1]/a")).click();
//			//TODO - Navigate to opened page.
//			LOGGER.info("Success!");
//		} catch (Exception e) {
//			throw new FailedToOpenUrlException("Url path to problem data is not loading.");
//		}
//		
//	}
//	
//	/*
//	 * Each problem is provided with an example input. To test the 
//	 * code this will pull that example input data.
//	 */
//	private List<String> convertTextToList(String text) {
//		List<String> list = new ArrayList<>();
//	
//		String[] elements = text.split("\n");
//		
//		list = Arrays.stream(elements).collect(Collectors.toList());
//		
//		return list;
//	}
//	
//	public List<String> getExampleData() {
//		List<String> exampleProblem = null;
//		try {
//			LOGGER.info("Attempting to extract example data");
//			driver.get(url);
//			String text = driver.findElement(By.xpath(getExample())).getText();
//			exampleProblem = convertTextToList(text);
//			LOGGER.info("Success");
//		} catch(Exception e) {
//			throw new FailedToFindDataException("Could not pull example test data from website");
//		}
//		return exampleProblem;
//	}
//
//	public List<String> getProblemData() {
//		List<String> problemData = null;
//		try {
//			LOGGER.info("Attempting to extract problem data.");
//			driver.get(problemUrl);
//			String text = driver.findElement(By.xpath(getProblem())).getText();
//			problemData = convertTextToList(text);
//			LOGGER.info("Success!");
//		} catch (Exception e) {
//			throw new FailedToFindDataException("Could not pull problem data from problem data page.");
//		}
//		
//		return problemData;
//	}
//	
//	public void quit() {
//		driver.quit();
//	}

}
