package com.corejava.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEx {
	// duplicates are allowed
	// insertion order preserved

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Gouthami");
		al.add(123);
		al.add(true);
		al.add(23.9f);
		al.add("Anjali");
		al.add('G');
		al.add("Anjali");
		al.add(2,false);
		System.out.println(al.get(4));
		
		System.out.println(al);
		
		ArrayList<Integer> a2 = new ArrayList(); // generics
        a2.add(16);
        a2.add(56);
        System.out.println(a2);
	}
}
