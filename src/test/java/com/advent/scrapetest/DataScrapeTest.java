package com.advent.scrapetest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.advent.exceptions.FailedToOpenUrlException;
import com.advent.exceptions.FailedToFindDataException;
import com.advent.scrape.DataScrapeImpl;

class DataScrapeTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(DataScrapeTest.class);
	private DataScrapeImpl dataScrape;
	private final String goodUrl = "https://adventofcode.com/2022/day/1";
	private final String badUrl = "badUrl";
	private final String practiceDataPath = "/html/body/main/article/pre/code";
	
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
	@Disabled("Testing other features")
	@Tag("URL")
	@Test
	void testValidUrl(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		dataScrape.setUrl(goodUrl);
		assertDoesNotThrow(() -> dataScrape.openProblem());
	}
	
	@Disabled("Testing other features")
	@Tag("URL")
	@Test
	void testInvalidUrl(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		dataScrape.setUrl(badUrl);
		assertThrows(FailedToOpenUrlException.class, () -> dataScrape.openProblem());
	}
	
	/* SAMPLE PUZZLE INPUT
	 * 
	 * The data should be retrieved from the puzzle and ready for use
	 * by the business logic of the application.
	 * 
	 */
	@Tag("Data")
	@Test
	void testFindPracticeDataDoesNotThrowException(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		dataScrape.setUrl(goodUrl);
		dataScrape.getUrl();
		dataScrape.setData(practiceDataPath);
		assertDoesNotThrow(() -> dataScrape.getProblemData());
	}
	
	@Tag("Data")
	@Test
	void testSuccessfullyRetrievedInputData(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		dataScrape.setUrl(goodUrl);
		dataScrape.getUrl();
		dataScrape.setData(practiceDataPath);
		int dataLength = dataScrape.getProblemData().size();
		assertTrue(dataLength > 0);
	}
}
