package com.springwebapp.firstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("rhythm");
		boolean isValidPassword = password.equalsIgnoreCase("123456");
		
		return isValidUserName && isValidPassword;
	}
}