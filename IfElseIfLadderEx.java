package com.traines.corejava;

import java.util.Scanner;

public class IfElseIfLadderEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num : ");
		int a = scan.nextInt();
		if(a > 0) {
			System.out.println("positive num");
		}
		else if (a < 0) {
			
			System.out.println("Negative num");
		}
		else {
			
			System.out.println(" equal  num");
		}
		
	}

}
