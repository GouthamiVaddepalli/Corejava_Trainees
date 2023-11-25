package com.corejava.oops;

class SuperClass{
	int a =289;
}

public class ThisSuperEx  extends SuperClass{
	int a = 234;
	void print() {
		int a = 256;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		ThisSuperEx ts = new ThisSuperEx();
		ts.print();
		
	}

}
