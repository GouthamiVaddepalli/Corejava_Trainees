package com.corejava.java8;

interface StaticEx {

	public static void m1() {
		System.out.println("static method of intreface");

	}

}

public class StaticMethodEx implements StaticEx {

	public static void main(String[] args) {
		// StaticMethodEx.m1();
		StaticEx.m1();

	}

}
