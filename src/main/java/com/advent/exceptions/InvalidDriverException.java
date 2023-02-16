package com.advent.exceptions;

public class InvalidDriverException extends Exception{
	private static final long serialVersionUID = 3074201455997305148L;

	public InvalidDriverException(String message) {
		super(message);
	}
}
