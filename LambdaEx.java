package com.corejava.java8;

@FunctionalInterface
interface lamda{
	
	void m1();
	
}

public class LambdaEx {

	public static void main(String[] args) {
		lamda lam = ()->System.out.println("Hello");
		lam.m1();
		
	}

}
