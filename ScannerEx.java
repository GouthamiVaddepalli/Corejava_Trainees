package corejava;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// ctrl + shift + o 
		System.out.println("Enter name :");
		String name = scan.next();
		
		System.out.println("Enter id :");
		int id = scan.nextInt();
		
		System.out.println("Enter marks");
		float marks = scan.nextFloat();
		System.out.println("Enter result");
		boolean result = scan.nextBoolean();
		System.out.println(name+ " " + id + "  " + marks + " " + result);
		

	}

}
