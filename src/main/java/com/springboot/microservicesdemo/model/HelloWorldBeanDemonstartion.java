package com.springboot.microservicesdemo.model;

public class HelloWorldBeanDemonstartion {
	
	private String responseMessage;

	public HelloWorldBeanDemonstartion(String responseMessage) {
		super();
		this.responseMessage = responseMessage;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	

}
