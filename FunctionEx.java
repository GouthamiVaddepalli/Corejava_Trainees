package com.corejava.java8;

import java.util.function.Function;
// apply();
//any i/p -----------> performs operation---------->>any type of o/p

public class FunctionEx {

	public static void main(String[] args) {
		Function<String,Integer>  fun = s->s.length();
		System.out.println("The length of the string is :" + fun.apply("Anjali"));
		
		Function<Integer,Integer> f = n-> n*n;
		
		System.out.println("The square  of the given num is :" + f.apply(4));
	}

}
