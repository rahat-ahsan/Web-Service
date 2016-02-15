package org.kth.webservice.FlightClient;

import java.util.Scanner;



import org.kth.webservice.flight.HelloWorld;
import org.kth.webservice.flight.HelloWorldImplService;
import org.kth.webservice.flight.User;

public class HelloWorldClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();
	//   hello.Seed();
		
		while(true){
		 Scanner inputReader = new Scanner(System.in);
		 		
		System.out.print("Enter UserId: ");
		String userId = inputReader.nextLine();
		//String userId= System.console().readLine();
		System.out.print("Enter Password: ");
		String password = inputReader.nextLine();
		//String password= System.console().readLine();
		
		User user = new User();
		user.setUserId(userId);
		user.setPassword(password);
		System.out.println(hello.login(user));
		
		System.out.println("Do you want to continue: ");
		}
	}

}
