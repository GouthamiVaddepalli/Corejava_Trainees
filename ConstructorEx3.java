package com.corejava.oops;

public class ConstructorEx3 {
	int id;
	String name;
	ConstructorEx3(){ // default constructor
		
	 System.out.println("this is default constructor");
	}
	ConstructorEx3(String n){ // parametreized constructor
		name = n;
		System.out.println("this is parameterized constructor");
	}
	
	ConstructorEx3(int i,String n){ // parametreized constructor
		name = n;
		id = i;
		System.out.println("this is two  parameterized constructor");
		System.out.println("Method overloading constructor");
	}
	void display() {
		System.out.println("id is : " + id + "and " + "name is : " + name);
	}
	
	public static void main(String[] args) {
		ConstructorEx3 cons = new ConstructorEx3();
		ConstructorEx3 cons1 = new ConstructorEx3("Gouthami");
		ConstructorEx3 cons2 = new ConstructorEx3(101,"Anjali");
		cons.display();
		cons1.display();
		cons2.display();
		
	

	}

}
