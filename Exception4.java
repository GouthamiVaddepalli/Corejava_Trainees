package com.corejava.exceptions;

public class Exception4 {

	public static void main(String[] args) {
		try {
			int x = 12 / 3;
		}
	
		catch (Exception e) {
			System.out.println("handles all the exceptions");

		} finally {
			System.out.println("executes everytime");

		}
	
		System.out.println("remaninig lines of code");
	}
			
}
