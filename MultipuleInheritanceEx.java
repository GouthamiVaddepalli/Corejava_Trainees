package com.corejava.oops;

interface A{
	public void m1();
}

interface B{
	public void m1();
}

public class MultipuleInheritanceEx  implements A,B{

	public static void main(String[] args) {
		
		MultipuleInheritanceEx  mi = new MultipuleInheritanceEx ();
		mi.m1();
	}

	@Override
	public void m1() {
		
		int a = 10;
		int b = 20;
		System.out.println(b/a);
	}

}
