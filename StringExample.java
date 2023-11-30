package com.corejava.oops;

public class StringExample {

	public static void main(String[] args) {
		String name = "welcome";
		// System.out.println(name.concat("to india"));

		//String result = name.concat("to String"); // welcometo String
		//System.out.println(result);
		
		
		//by using literal
		String name1 = "Welcome";
		String name2 = "Welcome";
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		
		// by using new keyword
		
		String name3 = new String("Apple");//apple
		String name4 = new String("apple");
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));
		System.out.println(name3.compareTo(name4));
		System.out.println(name3.equalsIgnoreCase(name4));
		//StringBuffer
		StringBuffer sb = new StringBuffer("java");
		sb.append("fullstack");
		System.out.println(sb);
		
		
		StringBuffer sb1 = new StringBuffer("java");
		
		StringBuffer sb2 = new StringBuffer("java");
		
		System.out.println(sb1== sb2);
		
		System.out.println(sb1.equals(sb2));
		
		

	}

}
