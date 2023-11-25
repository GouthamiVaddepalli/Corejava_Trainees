package com.corejava.oops;

class SuperClass1 {
	int a = 234;

	public SuperClass1() {
		System.out.println("this is default constructor of parent class");
	}

	public SuperClass1(int a) {
		System.out.println("this is parameterized constructor of parent class" + a);
	}

	public void m1() {
		System.out.println("parent class m1 method");
	}

	public void m1(int x) {
		System.out.println("parent class m1 method " + x);
	}
}

public class ThisSuperEx1  extends SuperClass1{

	int a = 222;

	public ThisSuperEx1() {
		super(45);
		System.out.println("default constructor of child class");
		
	}

	public ThisSuperEx1(String name) {
		this();
		System.out.println(this);
		System.out.println("paramertized constructor of child class"  + name);
		

	}

	public void m1() {
		System.out.println("This is child class m1 method");
	}

	public void display(int a) {
		this.m1();
		super.m1();
		System.out.println(a + " " + this.a + " " + super.a);
	}

	public static void main(String[] args) {
		ThisSuperEx1 ts = new ThisSuperEx1();
		ThisSuperEx1 ts1 = new ThisSuperEx1("Gouthami");
		ts.display(344);
		System.out.println(ts1);
		System.out.println(ts);

	}

}
