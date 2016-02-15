package org.kth.webservice.Flight;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="User")
public class User {
	
	@XmlElement (required=true)
private String UserId;
	
	@XmlElement(required=true)
private String Password;

	


public String getUserId() {
	return UserId;
}

public void setUserId(String userId) {
	UserId = userId;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public User(String userId, String password) {
	super();
	UserId = userId;
	Password = password;
}


public User() {

}

}
