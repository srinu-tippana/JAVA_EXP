package com.enhance.collections;

import java.util.LinkedList;

final class Book
{
	int id;
	String name;
	int quantity;
	public Book(int id, String name, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	
	
	
}

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Book> list = new LinkedList<Book>();
		
			Book b1 = new Book(23,"Chronicles of srinu",2);
			
			Book b2 = new Book(34,"Chronicles of Narnia",22);
			
			list.add(b1);
			list.add(b2);
			
			for(Book b:list)
			{
				System.out.println(b.id);
			}
			

	}

}
