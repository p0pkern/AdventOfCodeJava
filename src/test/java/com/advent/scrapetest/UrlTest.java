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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.advent.exceptions.FailedToOpenUrlException;
import com.advent.exceptions.FailedToFindDataException;
import com.advent.scrape.DataScrapeImpl;

class UrlTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(UrlTest.class);
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

	/*
	 * URL CHECKS
	 * 
	 * If there is a mistake in the URL and we cannot proceed with scraping the data
	 * off of the Advent site. We don't want to continue for nothing. An incorrect
	 * url should throw the in built FailedToOpenUrlException
	 * 
	 */
	@Tag("URL")
	@Test
	void testValidUrl(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		dataScrape.setUrl(goodUrl);
		assertDoesNotThrow(() -> dataScrape.openProblem());
	}

	@Tag("URL")
	@Test
	void testInvalidUrl(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		dataScrape.setUrl(badUrl);
		assertThrows(FailedToOpenUrlException.class, () -> dataScrape.openProblem());
	}

}
