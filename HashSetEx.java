package com.corejava.collections;

import java.util.HashSet;

public class HashSetEx {
  // duplictes are not allowed
	// insertion order is not preserved
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Gouthami");
		hs.add("Anjali");
		hs.add("Gouthami");
		hs.add(false);
		hs.add(12);
		System.out.println(hs);
		
		
		
		HashSet <String>  hs1 = new HashSet();
		hs1.add("gouthami");
		hs1.add("anjali");
		hs1.add("gouthami");
		System.out.println(hs1);
		hs.addAll(hs1);
		System.out.println(hs);
	}

}
