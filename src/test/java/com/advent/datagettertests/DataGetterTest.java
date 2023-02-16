package com.advent.datagettertests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.advent.exceptions.FailedToFindDataException;
import com.advent.exceptions.InvalidDriverException;
import com.advent.util.DataGetter;
import com.advent.util.DriverLoader;

class DataGetterTest {
	private DataGetter dataGetter;
	private DriverLoader driverLoader;

	@BeforeEach
	void setUp() throws InvalidDriverException {
		dataGetter = new DataGetter();
		driverLoader = new DriverLoader();
		driverLoader.loadDriver("Chrome");
		driverLoader.getUrl("https://adventofcode.com/2022/day/1");
	}
	
	@Test
	void testValidGetExampleData(){
		String path = "/html/body/main/article/pre/code";
		String result = dataGetter.getExampleData(driverLoader.getDriver(), path);
		String expected = "1000\n"
				+ "2000\n"
				+ "3000\n"
				+ "\n"
				+ "4000\n"
				+ "\n"
				+ "5000\n"
				+ "6000\n"
				+ "\n"
				+ "7000\n"
				+ "8000\n"
				+ "9000\n"
				+ "\n"
				+ "10000";
		assertEquals(expected, result);
	}
	
	@Test
	void testInvalidPathThrowsException() {
		assertThrows(FailedToFindDataException.class, () -> dataGetter.getExampleData(driverLoader.getDriver(), "badpath"));
	}
	
	@AfterEach
	void tearDown() {
		dataGetter = null;
		if (driverLoader.getDriver() != null)
			driverLoader.closeDriver();
		driverLoader = null;
	}

}
