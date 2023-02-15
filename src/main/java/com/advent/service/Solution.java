package com.advent.service;

import java.util.List;

public interface Solution {
	public int solveExample();
	public int solveProblem();
	public void goToPage();
	public void goToProblemDataPage();
	public void closePage();
	public int generateSolution(List<String> list);
	public void inputSolution();
}
