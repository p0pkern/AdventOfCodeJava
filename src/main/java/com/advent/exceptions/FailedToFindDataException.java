package com.advent.exceptions;

public class FailedToFindDataException extends RuntimeException{
	private static final long serialVersionUID = 1894139286440018214L;

	public FailedToFindDataException(String message) {
		super(message);
	}
}
