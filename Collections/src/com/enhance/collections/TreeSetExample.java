package com.enhance.collections;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.*;
public class TreeSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("Ravi");
		treeSet.add("Vijay");
		treeSet.add("Arca");
	     
		Iterator<String> itr= treeSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*Iterator itr1 = treeSet.descendingIterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}*/
	}

}
