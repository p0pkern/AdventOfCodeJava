package com.advent.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.advent.util.DataScrapeImpl;

public class DayOne {
//	private static final Logger LOGGER = LoggerFactory.getLogger(DayOne.class);
//	private DataScrapeImpl dataScrape;
//
//	public DayOne(String url, String example, String problemUrl, String problem) {
//		dataScrape = new DataScrapeImpl();
//		dataScrape.setUrl(url);
//		dataScrape.setExample(example);
//		dataScrape.setProblemUrl(problemUrl);
//		dataScrape.setProblem(problem);
//	}
//	
//	@Override
//	public int solveProblem() {
//		goToPage();
//		goToProblemDataPage();
//		List<String> problemData = dataScrape.getProblemData();
//		LOGGER.info("Answer: {}", generateSolution(problemData));
//		return 0;
//	}
//
//	@Override
//	public int solveExample() {
//		List<String> exampleProblem = dataScrape.getExampleData();
//		return generateSolution(exampleProblem);
//	}
//
//	private Map<Integer, Integer> totalElfCalories(List<String> list) {
//		Map<Integer, Integer> map = new HashMap<>();
//		int elf = 0;
//		int totalCalories = 0;
//		int iterations = 1;
//		
//		LOGGER.info("Dividing Elf Calories By Elf");
//		for (String calories : list) {
//			LOGGER.info("Current Iteration : {} Values : {}", iterations++, map.toString());
//			if (calories.trim().equals("")) {
//				map.put(elf, totalCalories);
//				totalCalories = 0;
//				elf++;
//			} else {
//				totalCalories += Integer.parseInt(calories);
//			}
//		}
//		return map;
//	}
//
//	@Override
//	public int generateSolution(List<String> list) {
//		goToPage();
//		LOGGER.info("Generating Solution to Day One Example");
//		Map<Integer, Integer> map = totalElfCalories(list);
//
//		return Collections.max(map.values());
//	}
//
//	@Override
//	public void inputSolution() {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	public void goToPage() {
//		dataScrape.openProblem();
//	}
//
//	@Override
//	public void closePage() {
//		dataScrape.quit();
//
//	}
//
//	@Override
//	public void goToProblemDataPage() {
//		dataScrape.openProblemData();
//	}

}
