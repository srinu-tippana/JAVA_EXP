package com.enhance.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("one");
		set1.add("2");
		set.addAll(set1);
	    Iterator itr = set.iterator();
	    
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    
	    

	}

}
