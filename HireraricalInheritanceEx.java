package com.corejava.oops;

class Parents {
	void parent() {
		System.out.println("This is from Parent");

	}

}

class Child1  extends Parents{
	void childMethod1() {
		System.out.println("this is from child1 class");
	}

}

public class HireraricalInheritanceEx extends Parents {
	void childMethod2() {
		System.out.println("This is from child2 class");
	}

	public static void main(String[] args) {

		HireraricalInheritanceEx hi = new HireraricalInheritanceEx();
		hi.childMethod2();
		hi.parent();
		Child1 ch = new Child1();
		ch.childMethod1();

	}

}
