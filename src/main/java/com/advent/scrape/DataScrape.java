package com.advent.scrape;

import java.util.List;

public interface DataScrape {
	public void openProblem();
	public List<String> getExampleData();
	public List<String> getProblemData();
	
}
