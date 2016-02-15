package org.kth.webservice.Flight;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "org.kth.webservice.Flight.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
	List<String> user = new ArrayList<String>();
	List<User> users = new ArrayList<User>();
	
	public HelloWorldImpl()
	{
		
		
		
		users.add(new User("aaa", "123"));
		users.add(new User("bbb", "123"));
		users.add(new User("ccc", "123"));
		users.add(new User("ddd", "123"));
		
	}

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + user.get(1);
	}

	@Override
	public String Login(User user) {
		
		int searchListLength = users.size();
		for (int i = 0; i < searchListLength; i++) 
		{
			if (users.get(i).getUserId().contains(user.getUserId()))
			{
				if(users.get(i).getPassword().equals(user.getPassword()))
				{
					return "Login Success";
				}
				else 
					return "Wrong Password";
	
			}
		
		}
		 
			return "No User found";
		
	}

}