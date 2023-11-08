package com.traines.corejava;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num:");
		int a = scan.nextInt();
		
		System.out.println("Enter b num:");
		int b = scan.nextInt();
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			
			System.out.println("b is greater than a");
		}
		
		
		
}
}