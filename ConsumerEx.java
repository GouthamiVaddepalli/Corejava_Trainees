package com.corejava.java8;

import java.util.function.Consumer;
// accept();
// takes inputs----------does not print anything
// can be printed


public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> c = s->System.out.println(s);
		c.accept("Anjali");
		c.accept("Gouthami");
		
	    
	}

}
