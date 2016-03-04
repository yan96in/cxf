package com.cxf.server;

import javax.xml.ws.Endpoint;

public class webserviceApp {

	public static void main(String[] args) {
		System.out.println("web service start");
		HelloWorldImpl hl=new HelloWorldImpl();
		String address="http://localhost:8080/helloWorld";
		Endpoint.publish(address, hl); 
		System.out.println("web service started");  
	}
}
