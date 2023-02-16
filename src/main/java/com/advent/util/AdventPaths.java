package com.advent.util;

public class AdventPaths {
	private String pathToDayProblem;
	private String pathToExampleData;
	private String pathToOpenProblemData;
	private String pathToProblemData;
	private String pathToSubmissionInput;
	private String pathToSubmit;

	public AdventPaths(String pathToDayProblem, String pathToExampleData, String pathToOpenProblemData,
			String pathToProblemData, String pathToSubmissionInput, String pathToSubmit) {
		this.pathToDayProblem = pathToDayProblem;
		this.pathToExampleData = pathToExampleData;
		this.pathToOpenProblemData = pathToOpenProblemData;
		this.pathToProblemData = pathToProblemData;
		this.pathToSubmissionInput = pathToSubmissionInput;
		this.pathToSubmit = pathToSubmit;
	}

	
	public String getPathToDayProblem() {
		return pathToDayProblem;
	}

	
	public String getPathToExampleData() {
		return pathToExampleData;
	}


	public String getPathToOpenProblemData() {
		return pathToOpenProblemData;
	}


	public String getPathToProblemData() {
		return pathToProblemData;
	}


	public String getPathToSubmissionInput() {
		return pathToSubmissionInput;
	}


	public String getPathToSubmit() {
		return pathToSubmit;
	}

}
