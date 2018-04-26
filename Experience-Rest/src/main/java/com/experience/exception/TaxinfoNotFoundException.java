package com.experience.exception;

@SuppressWarnings("serial")
public class TaxinfoNotFoundException extends RuntimeException{
	
	public TaxinfoNotFoundException(String exception) {
		super(exception);
	}

}
