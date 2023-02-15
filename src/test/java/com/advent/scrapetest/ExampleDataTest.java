package com.advent.scrapetest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.advent.scrape.DataScrapeImpl;

@TestInstance(Lifecycle.PER_CLASS)
class ExampleDataTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(UrlTest.class);
	private DataScrapeImpl dataScrape;
	private final String url = "https://adventofcode.com/2022/day/1";
	private final String practiceDataPath = "/html/body/main/article/pre/code";
	
	@BeforeAll
	void setUp() {
		dataScrape = new DataScrapeImpl();
		dataScrape.setUrl(url);
		dataScrape.getUrl();
		dataScrape.setExample(practiceDataPath);
	}
	
	@AfterAll
	void tearDown() {
		dataScrape.quit();
	}

	/*
	 * SAMPLE PUZZLE INPUT
	 * 
	 * The data should be retrieved from the puzzle and ready for use by the
	 * business logic of the application.
	 * 
	 */
	@Tag("Data")
	@Test
	void testFindPracticeDataDoesNotThrowException(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		assertDoesNotThrow(() -> dataScrape.getExampleData());
	}

	@Tag("Data")
	@Test
	void testSuccessfullyRetrievedInputData(TestInfo test) {
		LOGGER.info(test.getDisplayName());
		int dataLength = dataScrape.getExampleData().size();
		assertTrue(dataLength > 0);
	}

	@Tag("Data")
	@ParameterizedTest
	@MethodSource("com.advent.scrapetest.ExampleInputParams#exampleInputProvider")
	void testValidDataFromExampleProblem(List<String> exampleInput, TestInfo test) {
		LOGGER.info(test.getDisplayName());
		List<String> testData = dataScrape.getExampleData();
		
		for(int i = 0; i < exampleInput.size(); i++) {
			assertEquals(exampleInput.get(i), testData.get(i));
		}
	}

}

class ExampleInputParams {
	private ExampleInputParams() {
		
	}
	
	static Stream<List<String>> exampleInputProvider() {
		return Stream.of(Arrays.asList("1000", "2000", "3000","" , "4000", "", "5000", "6000", "", "7000", "8000", "9000", "","10000"));
	}
}
