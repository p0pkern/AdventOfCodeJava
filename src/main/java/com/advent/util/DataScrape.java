package com.advent.util;

import java.util.List;

public interface DataScrape {
	public void openProblem();
	public void openProblemData();
	public List<String> getExampleData();
	public List<String> getProblemData();
	
}
