package com.corejava.arrays;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// java.util.package
		System.out.println("enter the size of array");
		int size = scan.nextInt();
		
		int[] data = new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < data.length; i++) {
			
			data[i] = scan.nextInt();
			
		}
		for (int i : data) {
			System.out.println(i);
		}

	}

}
