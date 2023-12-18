package com.corejava.collections;

import java.util.LinkedHashSet;
// duplicates are not allowed
// insertion order is follows
public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("Gouthami");
		hs.add("Gouthami");
		hs.add("Anjali");
		hs.add("Gouthami");
		hs.add(false);
		hs.add(12);
		System.out.println(hs);

	}

}
