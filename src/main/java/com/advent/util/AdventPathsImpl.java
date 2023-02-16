package com.advent.util;

public class AdventPathsImpl implements AdventPaths {
	private String pathToDayProblem;
	private String pathToExampleData;
	private String pathToOpenProblemData;
	private String pathToProblemData;
	private String pathToSubmissionInput;
	private String pathToSubmit;

	public AdventPathsImpl(String pathToDayProblem, String pathToExampleData, String pathToOpenProblemData,
			String pathToProblemData, String pathToSubmissionInput, String pathToSubmit) {
		this.pathToDayProblem = pathToDayProblem;
		this.pathToExampleData = pathToExampleData;
		this.pathToOpenProblemData = pathToOpenProblemData;
		this.pathToProblemData = pathToProblemData;
		this.pathToSubmissionInput = pathToSubmissionInput;
		this.pathToSubmit = pathToSubmit;
	}

	@Override
	public String getPathToDayProblem() {
		return pathToDayProblem;
	}

	@Override
	public String getPathToExampleData() {
		return pathToExampleData;
	}

	@Override
	public String getPathToOpenProblemData() {
		return pathToOpenProblemData;
	}

	@Override
	public String getPathToProblemData() {
		return pathToProblemData;
	}

	@Override
	public String getPathToSubmissionInput() {
		return pathToSubmissionInput;
	}

	@Override
	public String getPathToSubmit() {
		return pathToSubmit;
	}

}
