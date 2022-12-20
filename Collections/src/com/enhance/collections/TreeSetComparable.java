package com.enhance.collections;

import java.util.Iterator;
import java.util.TreeSet;

class BookSet implements Comparable<BookSet>{
	
	int id;
	String name;
	public BookSet(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(BookSet b1)
	{
		return this.id-b1.id;
	}
	
}
public class TreeSetComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<BookSet> treeSet = new TreeSet<BookSet>();
		
		BookSet b1 = new BookSet(2,"Java");
		BookSet b2 = new BookSet(1,"C");
		
		//Here in the treeSet we  are adding an object of type Book
		treeSet.add(b1);
		treeSet.add(b2);
		
		
		Iterator<BookSet> iterator = treeSet.iterator();
		
	   for(BookSet bks:treeSet)
		{
			System.out.println(bks.id+""+bks.name);
		}
		

	}

}
