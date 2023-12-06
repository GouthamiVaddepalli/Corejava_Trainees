package com.corejava.exceptions;

class InvalidLoginCredentials extends Exception {
	String username;
	String password;

	public InvalidLoginCredentials(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String toString() {
		return "please enter valid credentials";

	}
}

public class UserException {
	static void credentials(String username,String password) throws InvalidLoginCredentials {
		if (username != "Gouthami")
			throw new InvalidLoginCredentials(username,password);
		else if(password != "Gouthami123")
			throw new InvalidLoginCredentials(username,password);
		else
			System.out.println("login Sucuess");
		
	}

	public static void main(String[] args) throws InvalidLoginCredentials  {
		
          UserException.credentials("Gouthami", "Gouthami123");
		
	}

}
