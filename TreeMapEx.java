package com.corejava.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx { // ctrl + shift + o
	// It follows sorted Order

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(150, "Gouthami");
		map.put(156, "Harshine");
		map.put(150, "Anjali");
		map.put(158, "dharani");
		map.put(157, "Gouthami");
		map.put(170, "Laxmi");
		System.out.println(map);
		
		Set <Integer> key = map.keySet();
		
		Iterator<Integer>  itr = key.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			
//			
//		}
		System.out.println("*************************************************");
		
		while(itr.hasNext()) {
			
			int keys = itr.next();
			System.out.println(keys + ":" + map.get(keys));
		}
		
		System.out.println("********************************");
		Set<Entry <Integer,String>> entries = map.entrySet();
		Iterator<Entry<Integer,String>> entry = entries.iterator();
		while(entry.hasNext()) {
			Entry<Integer,String > entrys = entry.next();
			System.out.println(entrys.getKey() + ":" + entrys.getValue());
			
		}

	}

}
