package com.corejava.oops;

class Age{
	void changeAge(int age) {
		System.out.println(age += 1); // age = age + 1
	}
}

public class FinalEx  extends Age{
	@Override
	void changeAge(int age) {
		System.out.println(age -= 1); // age = age - 1
	}
	public static void main(String[] args) {
		FinalEx fs = new FinalEx();
		fs.changeAge(25);
		
	}

}
