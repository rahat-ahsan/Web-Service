package org.kth.webservice.Flight;


import javax.xml.ws.Endpoint;
import org.kth.webservice.Flight.HelloWorldImpl;


public class HelloWorldPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Endpoint.publish("http://localhost:8080/ws/hello", new HelloWorldImpl());
	}

}
