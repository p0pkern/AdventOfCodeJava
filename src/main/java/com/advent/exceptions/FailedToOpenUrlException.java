package com.advent.exceptions;

public class FailedToOpenUrlException extends RuntimeException{
	
	private static final long serialVersionUID = -4168668374332069016L;

	public FailedToOpenUrlException(String message){
		super(message);
	}

}
