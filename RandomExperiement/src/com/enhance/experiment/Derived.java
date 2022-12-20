package com.enhance.experiment;


class Base{
	
	public static void display() {
		System.out.println("Display method of static parent class");
	}
	
	public void print()
	{
		System.out.println("Non static or instance method from the parent  ");
	}
}

public class Derived extends Base {

	public static void display()
	{
		System.out.println("Display method of static Derived class");
	}
	
	public void print()
	{
		System.out.println("Non static class from the Derived class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b1 = new Derived();
		
		b1.display();
		b1.print();
		
		
		
		
		

	}

}