package com.corejava.exceptions;

public class Exception5 {

	public static void main(String[] args) {
		try {
			int a = 20 / 2;
			System.exit(0);
			System.out.println(a);
			
		} finally {
			System.out.println("finally block is always iss executed");
		}
		System.out.println("remaining code");
	}

}
