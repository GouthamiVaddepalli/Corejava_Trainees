package com.corejava.exceptions;

public class Exception3 {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[4] = 10 / 2;
			String s = null ;
			System.out.println(s.length());
			//String s = "Gouthami";
			//int x = Integer.parseInt(s);
		}

		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("max index is 4");
		} catch (ArithmeticException e) {
			System.out.println("dont enter the denominator as zero");

		} catch (NumberFormatException e) {
			System.out.println("we cannot convert string into Integer");

		} catch (Exception e) {
			System.out.println("unable to find length");

		} finally {
			System.out.println("it is always executes");
		}
		System.out.println("remaining lines of code is executed");
	}

}
