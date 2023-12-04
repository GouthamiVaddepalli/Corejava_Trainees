package com.corejava.exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first num");
		int firstNum = scan.nextInt();

		System.out.println("enter the second number");
		int secondNum = scan.nextInt();
        try { // risky code
		int result = firstNum / secondNum;

		System.out.println(result);
         }
        catch(ArithmeticException e) { // handle code
       	 System.out.println("enter denominatior as zero");
       	 
        }
        finally {
        	System.out.println("excutes always");
        }

		System.out.println("remaing lines of code");

	}

}
