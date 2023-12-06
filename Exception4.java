package com.corejava.exceptions;

public class Exception4 {

	public static void main(String[] args) {
		try {
			
			int x = 12/0;
			try {
				int b = 40/2;
				try {
					int a[] = new int[5];
					a[5] = 19;
				}finally {
					System.out.println("inner try block");
				}
				System.out.println("remaining try statements");
			}catch(ArithmeticException e) {
				System.out.println("enter denomintor as zero");
			}catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("max index is 4");
			}
		}
		catch(Exception e) {
			System.out.println("handles all execeptions");
		}
		finally {
			System.out.println("Executes always ");
			
		}
		System.out.println("remaining lines of code ");
		
	}
			
}
