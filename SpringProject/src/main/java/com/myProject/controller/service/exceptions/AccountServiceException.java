package com.myProject.controller.service.exceptions;

public class AccountServiceException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String statusCode;
    private String description;
    private int httpStatus;  
    
	public AccountServiceException(String code, String desc)
    {
        this.statusCode = code;
        this.description = desc;
    }

}
