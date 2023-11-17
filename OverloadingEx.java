package com.corejava.oops;

public class OverloadingEx {
	public void add(int a ,int b) {
		System.out.println("addition of two numbers : " + (a+b));
	}
	public void add(int a,int b, int c) {
		System.out.println("addition of three numbers: " + (a+b+c)); // numbers of parametrs
	}
	public void add(float a , float b) {
		System.out.println("addition of float numbers: " + (a+b)); // type of parameters
		
	}
	public void add(int a , float b) {
		System.out.println("addition of int and float numbers: " + (a+b));
	}
	public void add(float a , int b) {
		System.out.println("addition of float and int numbers: " + (a+b));// order of parrametrs
	}
	public static void main(String[] args) {
		OverloadingEx ovr = new OverloadingEx();
		ovr.add(15, 25);
		ovr.add(5, 10, 15);
		ovr.add(2.5f, 3.5f);
		ovr.add(2.5f, 2);
		ovr.add( 'a' , 'b'); // type promotion

	}

}
