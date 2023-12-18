package com.corejava.collections;

import java.util.LinkedHashMap;
// insertion order follows 
// when we give key  num it will override the key values 

public class LinkedHaspMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(101, "Gouthami");
		map.put(151, "Laxmi");
		map.put(101, "Harshine");
		map.put(160, "Anjali");
		map.put(17, "Gouthami");
		map.put(109, "Stella");
		System.out.println(map);

	}

}
