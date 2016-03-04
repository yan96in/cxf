package com.cxf.server;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.cxf.server.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld{
	@Override
	public String sayHi(@WebParam(name = "text") String text) {
		return "Hello"+text;
	}

}
