package com.advent.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.advent.util.AdventPaths;
import com.advent.util.DataGetter;
import com.advent.util.DriverLoader;

public class DayOne implements Solution{
	private AdventPaths paths;
	private DriverLoader driverLoader;
	private DataGetter dataGetter;
	
	public DayOne(AdventPaths paths, DriverLoader driverLoader, DataGetter dataGetter) {
		this.paths = paths;
		this.driverLoader = driverLoader;
		this.dataGetter = dataGetter;
	}
	
	private int findMax(Map<Integer, Integer> map) {
		return Collections.max(map.values());
	}
	
	private Map<Integer, Integer> convertToMap(String[] data) {
		Map<Integer, Integer> map = new HashMap<>();
		int elf = 0;
		int total = 0;
		for(String number: data) {
			if(number.trim().equals("")) {
				map.put(elf, total);
				elf++;
				total = 0;
			} else {
				total += Integer.parseInt(number.trim());
			}
		}
		
		return map;
	}
	
	private String[] splitData (String data){
		return data.split("\n");
	}

	@Override
	public int solveExample() {
		driverLoader.getUrl(paths.getPathToDayProblem());
		String data = dataGetter.getExampleData(driverLoader.getDriver(), paths.getPathToExampleData());
		String[] splitData = splitData(data);
		Map<Integer, Integer> map = convertToMap(splitData);
		return findMax(map);
	}

	@Override
	public int solveProblem() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
