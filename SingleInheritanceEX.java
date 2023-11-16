package com.corejava.oops;

class Parent{ // single inheritance
	int marks = 100;
    public void display() {
    	
    	System.out.println("This is from a parent class");
    }
	
	
}

public class SingleInheritanceEX  extends Parent{
	void displayMsg() {
		
		System.out.println("This is from a child class");
	}

	public static void main(String[] args) {
		
		SingleInheritanceEX obj = new SingleInheritanceEX();
		
		obj.displayMsg();

		obj.display();
		System.out.println("marks: " + obj.marks);
	}

}
