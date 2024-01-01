package com.corejava.java8;

import java.time.LocalDateTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		LocalDateTime dt1 = LocalDateTime.of(1995, 7, 27, 05, 20, 15);
		System.out.println(dt);
		System.out.println(dt1);
		System.out.println("after six months : " + dt1.plusMonths(6));
		System.out.println("Before six months : " + dt1.minusMonths(6));

	}

}
