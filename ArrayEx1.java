package com.corejava.arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		String[] name = {"Gouthami","Anjali","Apple","Orange"}; // literal
		name[3] = "Anushka";
		System.out.println(name);
		System.out.println(name[3]);
		for (int i = 0; i < 4 ; i++) {
			System.out.println(name[i]);
			
		}
		for (String string : name) {
			System.out.println(string);
			
		}
		
		String[] names = new String[5]; // new keyword
		for (int i = 0; i < names.length; i++) {
			names[i] = "welcome";
			System.out.println(names[i]);
		}
        for (String s : names) {
        	System.out.println(s);
			
		}
	}

}
