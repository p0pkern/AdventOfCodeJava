package com.advent.driverloadertests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.advent.exceptions.InvalidDriverException;
import com.advent.util.DriverLoader;

class DriverLoaderTest {
	private DriverLoader driverLoader;
	
	@BeforeEach
	void setUp() {
		driverLoader = new DriverLoader();
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
	
	@AfterEach
	void tearDown() {
		if(driverLoader.getDriver() != null) {
			driverLoader.closeDriver();
		}
		driverLoader = null;
	}
}
