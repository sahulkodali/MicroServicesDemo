package com.springboot.microservicesdemo.exceptionhandler;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timeOfOccurenceOfException;
	private String causeForOccurenceOfException;
	private String detailExplanationOfException;
	
	
	public ExceptionResponse(Date timeOfOccurenceOfException, String causeForOccurenceOfException,
			String detailExplanationOfException) {
		super();
		this.timeOfOccurenceOfException = timeOfOccurenceOfException;
		this.causeForOccurenceOfException = causeForOccurenceOfException;
		this.detailExplanationOfException = detailExplanationOfException;
	}


	public Date getTimeOfOccurenceOfException() {
		return timeOfOccurenceOfException;
	}


	public void setTimeOfOccurenceOfException(Date timeOfOccurenceOfException) {
		this.timeOfOccurenceOfException = timeOfOccurenceOfException;
	}


	public String getCauseForOccurenceOfException() {
		return causeForOccurenceOfException;
	}


	public void setCauseForOccurenceOfException(String causeForOccurenceOfException) {
		this.causeForOccurenceOfException = causeForOccurenceOfException;
	}


	public String getDetailExplanationOfException() {
		return detailExplanationOfException;
	}


	public void setDetailExplanationOfException(String detailExplanationOfException) {
		this.detailExplanationOfException = detailExplanationOfException;
	}
	
	

}
