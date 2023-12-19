package com.corejava.collections;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Gouthami");
		map.put(151, "Laxmi");
		map.put(101, "Harshine");
		map.put(160, "Anjali");
		map.put(17, "Gouthami");
		map.put(109, "Stella");
		System.out.println(map);

	}

}
