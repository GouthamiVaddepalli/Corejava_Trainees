package com.corejava.oops;
class Parent6{
	
	int property() {
		return 100000000;
	}
	
	public void wedding() {
		System.out.println("sam");
	}
}


public class OverriddingEx extends Parent6 {
	@Override
	public void wedding() {
		System.out.println("Thamanna");
	}
	
	public static void main(String[] args)  {
		
		OverriddingEx override = new OverriddingEx();
		override.wedding();

	}

}
