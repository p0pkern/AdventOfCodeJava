package com.advent.daytests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.advent.service.dayone.DayOne;

@TestInstance(Lifecycle.PER_CLASS)
class DayOneTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(DayOneTest.class);
	private DayOne problem;
	private String url = "";
	private String examplePath = "";
	
	@BeforeAll
	void setUp() {
		problem = new DayOne("https://adventofcode.com/2022/day/1","/html/body/main/article/pre/code");
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
