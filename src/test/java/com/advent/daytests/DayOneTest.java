package com.advent.daytests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.advent.exceptions.InvalidDriverException;
import com.advent.service.DayOne;
import com.advent.util.AdventPaths;
import com.advent.util.DataGetter;
import com.advent.util.DriverLoader;

class DayOneTest {
	private DayOne dayOne;
	private AdventPaths paths;
	private DataGetter dataGetter;
	private DriverLoader driverLoader;
	
	private String pathToDayProblem = "https://adventofcode.com/2022/day/1";
	private String pathToExampleData = "/html/body/main/article/pre/code";
	private String pathToOpenProblemData = "/html/body/main/p[1]/a";
	private String pathToProblemData = "/html/body/pre";
	private String pathToSubmissionInput = "/html/body/main/form/p/input[1]";
	private String pathToSubmit = "/html/body/main/form/p/input[2]";
	
	@BeforeEach
	void setUp() throws InvalidDriverException {
		driverLoader = new DriverLoader();
		driverLoader.loadDriver("Chrome");
		paths = new AdventPaths(pathToDayProblem, pathToExampleData, pathToOpenProblemData, pathToProblemData, pathToSubmissionInput, pathToSubmit);
		dataGetter = new DataGetter();
		
		dayOne = new DayOne(paths, driverLoader, dataGetter);
	}

	@Test
	void test() {
		int result = dayOne.solveExample();
		int expected = 24000;
		assertEquals(expected, result);
	}
	
	@AfterEach
	void tearDown() {
		if(driverLoader.getDriver() != null) {
			driverLoader.closeDriver();
		}
		
		driverLoader = null;
		paths = null;
		dataGetter = null;
		dayOne = null;
	}

}
