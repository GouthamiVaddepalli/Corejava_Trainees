package com.corejava.collections;

import java.util.Iterator;
import java.util.TreeSet;
// inserion not follwed,duplicates are also not followed
// alphabetically when strings
// Asscending order

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("Gouthami");
		
		names.add("Anjali");
		
		names.add("Carrot");
		names.add("Dhanvi");	
		names.add("Gouthami");
		names.add("Anjali");
		
		System.out.println(names);
		
		
		TreeSet<Integer> names1 = new TreeSet<Integer>();
		names1.add(20);
		
		names1.add(15);
		
		names1.add(26);
		names1.add(8);	
		names1.add(27);
		names1.add(50);
		
		System.out.println(names1);
		;
		
		
		Iterator<String> itr = names.iterator(); // display the elements one by one
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			
			
		}
		
	}

}
