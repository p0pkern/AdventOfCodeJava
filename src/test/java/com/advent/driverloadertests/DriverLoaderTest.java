package com.advent.driverloadertests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.advent.exceptions.InvalidDriverException;
import com.advent.util.DriverLoader;
import com.advent.util.DriverLoaderImpl;

@TestInstance(Lifecycle.PER_CLASS)
class DriverLoaderTest {
	private DriverLoader driverLoader;
	
	@BeforeAll
	void setUp() {
		driverLoader = new DriverLoaderImpl();
	}

	@Test
	void testValidDriverChromeDriver() throws InvalidDriverException {
		assertTrue(driverLoader.loadDriver("Chrome"));
	}
	
	@Test
	void testInvalidDriverThrowsException() {
		assertThrows(InvalidDriverException.class, () -> driverLoader.loadDriver("BadDriver"));
	}
	
	@Test
	void testGoesToValidUrl() throws InvalidDriverException {
		driverLoader.loadDriver("Chrome");
		driverLoader.getUrl("https://adventofcode.com/2022/day/1");
		String title = driverLoader.getDriver().getTitle();
		
		assertEquals("Day 1 - Advent of Code 2022", title);
	}
	
	@AfterAll
	void tearDown() {
		if(driverLoader.getDriver() != null) {
			driverLoader.closeDriver();
		}
		driverLoader = null;
	}
}
