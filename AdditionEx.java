package com.corejava.java8;

public class AdditionEx {
	@FunctionalInterface
	interface adder{
		void addition(int a , int b);
		
	}

	public static void main(String[] args) {
		
		adder add = (a,b)->System.out.println("addition of two numbers : " + ( a+b));
        add.addition(25, 25);
	}

}
