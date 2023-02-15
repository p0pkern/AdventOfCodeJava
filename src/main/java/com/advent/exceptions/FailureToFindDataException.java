package com.advent.exceptions;

public class FailureToFindDataException extends RuntimeException{
	private static final long serialVersionUID = 1894139286440018214L;

	public FailureToFindDataException(String message) {
		super(message);
	}
}
