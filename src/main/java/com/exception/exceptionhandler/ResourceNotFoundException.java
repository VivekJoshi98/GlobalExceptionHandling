package com.exception.exceptionhandler;

public class ResourceNotFoundException extends RuntimeException{

	private String message;
	
	
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public ResourceNotFoundException(String message) {
		this.message = message;
	}
	
}
