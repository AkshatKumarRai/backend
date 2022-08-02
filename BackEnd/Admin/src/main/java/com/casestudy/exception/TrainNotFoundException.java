package com.casestudy.exception;
@SuppressWarnings("serial")
public class TrainNotFoundException extends Exception {

	public TrainNotFoundException()
	{
		//Default Constructor
	}
	
	public TrainNotFoundException(String message)
	{
		super(message);
	}



}