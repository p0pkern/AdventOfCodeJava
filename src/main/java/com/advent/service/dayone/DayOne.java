package com.advent.service.dayone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.advent.scrape.DataScrapeImpl;
import com.advent.service.Solution;

public class DayOne implements Solution{
	private static final Logger LOGGER = LoggerFactory.getLogger(DayOne.class);
	private DataScrapeImpl dataScrape;
	
	public DayOne(String url, String example) {
		dataScrape = new DataScrapeImpl();
		dataScrape.setUrl(url);
		dataScrape.setExample(example);
	}

	@Override
	public void generateSolution() {
		goToPage();
	}

	@Override
	public void inputSolution() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goToPage() {
		dataScrape.openProblem();
	}

	@Override
	public void closePage() {
		dataScrape.quit();
		
	}

}
