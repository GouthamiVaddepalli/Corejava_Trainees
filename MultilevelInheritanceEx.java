package com.corejava.oops;

class SuperParent{
	int division(int a ,int b) {
		System.out.println("This is from superparent class");
		return a/b;
		
	}
}

class Parent1 extends SuperParent{
	int multiplication(int a ,int b) {
		System.out.println("This is from parent class");
		return a * b;
	}
}

public class MultilevelInheritanceEx  extends Parent1{
	
   int addition(int a ,int b) {
	   System.out.println("This is from child class");
	return a+b;
	   
   }
	public static void main(String[] args) {
		MultilevelInheritanceEx mi = new MultilevelInheritanceEx();
		System.out.println(mi.addition(10, 20));
		System.out.println(mi.multiplication(20, 30));
		System.out.println(mi.division(20, 10));
		
	}

}
