package com.corejava.oops;

interface SuperParent1{
	
	abstract void display(); // public abstract void display();
}


abstract class AParent implements SuperParent1{
	
	void m2() {
		System.out.println("This is from m2 method");
	}
	abstract void m3();
}

public class AbstractclassInheritaceEx extends AParent{
	void m1() {
		System.out.println("This is from child class of  m1 method...");

	}

	public static void main(String[] args) {
		
		AbstractclassInheritaceEx ab = new AbstractclassInheritaceEx();
		ab.m1();
		ab.m3();
		ab.m2();
		ab.display();

	}

	@Override
	void m3() {
		
		System.out.println("this is unemplemented method of AParent");
	}

	@Override
	public void display() {
		System.out.println("This is from unemplemented of display method");
		
	}

}
