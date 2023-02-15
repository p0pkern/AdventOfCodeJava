package com.advent.scrapetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.advent.exceptions.FailedToOpenUrlException;
import com.advent.scrape.DataScrape;
import com.advent.scrape.DataScrapeImpl;

class DataScrapeTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(DataScrapeTest.class);
	private DataScrapeImpl dataScrape;
	private final String goodUrl = "https://adventofcode.com/2022/day/1";
	private final String badUrl = "badUrl";
	
	@BeforeEach
	void setUp() {
		dataScrape = new DataScrapeImpl();
	}
	
	@AfterEach
	void tearDown() {
		dataScrape.quit();
	}
	
	/* URL CHECKS
	 * 
	 * If there is a mistake in the URL and we cannot proceed with
	 * scraping the data off of the Advent site. We don't want to
	 * continue for nothing. An incorrect url should throw the in built
	 * FailedToOpenUrlException
	 * 
	 */
	
	@Test
	void testValidUrl(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		dataScrape.setUrl(goodUrl);
		assertDoesNotThrow(() -> dataScrape.openProblem());
	}
	
	@Test
	void testInvalidUrl(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		dataScrape.setUrl(badUrl);
		Assertions.assertThrows(FailedToOpenUrlException.class, () -> dataScrape.openProblem());
	}
	
	/* SAMPLE PUZZLE INPUT
	 * 
	 * The data should be retrieved from the puzzle and ready for use
	 * by the business logic of the application.
	 * 
	 */
	
	@Test
	void testValidData(TestInfo test) {
		
	}
}
