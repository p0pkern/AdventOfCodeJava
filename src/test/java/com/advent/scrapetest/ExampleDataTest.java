package com.advent.scrapetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.advent.scrape.DataScrapeImpl;

class ExampleDataTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(UrlTest.class);
	private DataScrapeImpl dataScrape;
	private final String url = "https://adventofcode.com/2022/day/1";
	private final String practiceDataPath = "/html/body/main/article/pre/code";
	
	@BeforeAll
	void setUp() {
		dataScrape = new DataScrapeImpl();
	}

	/*
	 * SAMPLE PUZZLE INPUT
	 * 
	 * The data should be retrieved from the puzzle and ready for use by the
	 * business logic of the application.
	 * 
	 */
	@Disabled("Testing other features")
	@Tag("Data")
	@Test
	void testFindPracticeDataDoesNotThrowException(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		dataScrape.setUrl(url);
		dataScrape.getUrl();
		dataScrape.setExample(practiceDataPath);
		assertDoesNotThrow(() -> dataScrape.getExampleData());
	}

	@Tag("Data")
	@Test
	void testSuccessfullyRetrievedInputData(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		dataScrape.setUrl(url);
		dataScrape.getUrl();
		dataScrape.setExample(practiceDataPath);
		int dataLength = dataScrape.getExampleData().size();
		assertTrue(dataLength > 0);
	}

	@Tag("Data")
	@ParameterizedTest
	@ValueSource(strings = "1000, 2000, 3000, , 4000, , 5000, 6000, , 7000, 8000, 9000, ,10000")
	void testValidDataFromExampleProblem(TestInfo test, String argument) {
		LOGGER.info(test.getDisplayName());
		dataScrape.setUrl(url);
		dataScrape.getUrl();
	}

}
