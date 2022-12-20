package com.enhance.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExampleComparingKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(2,"Srinu");
		map.put(1,"tippana");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);;
		
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		
		
		
	}

}
