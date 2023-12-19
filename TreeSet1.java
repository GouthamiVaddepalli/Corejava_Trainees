package com.corejava.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		class ReverseOrder implements Comparator<String>{

			@Override
			public int compare(String o1, String o2) {
				
				//return o2.compareTo(o1);
				return -o1.compareTo(o2);
			}
			
		}
		TreeSet<String> ts = new TreeSet<String>(new ReverseOrder());
		ts.add("Gouthami");
		ts.add("Anjali");
		ts.add("Dharini");
		ts.add("Harshine");
		ts.add("Laxmi");
		System.out.println(ts);
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}

	}

}
