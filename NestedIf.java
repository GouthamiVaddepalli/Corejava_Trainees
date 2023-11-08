package com.traines.corejava;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter country name ;");
		String country = scan.next();
		System.out.println("Enter state name :");
		String state = scan.next();
		if(country.equals("India")) {
			if(state.equals("Delhi")) {
				
				System.out.println("Welcome to the Delhi");
			}
			else if(state.equals("Gujarat")) {
				
				System.out.println("Welcome to the Gujarat");
			}
			else {
				
				System.out.println("Other parts of india");
			}
		}
		
	}
}
		
		


