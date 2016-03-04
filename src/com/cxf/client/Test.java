package com.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.cxf.server.HelloWorld;

public class Test {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
		jwpfb.setServiceClass(HelloWorld.class);  
        jwpfb.setAddress("http://localhost:8080/helloWorld");  
        HelloWorld hw = (HelloWorld) jwpfb.create(); 
        System.out.println(hw.sayHi("xx"));  
	}

}
