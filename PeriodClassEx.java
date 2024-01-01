package com.corejava.java8;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClassEx {

	public static void main(String[] args) {
		LocalDate bdy = LocalDate.of(1995, 7, 27);
		LocalDate tdy = LocalDate.now();
		Period p = Period.between(bdy, tdy);
		System.out.println("Years is : " + p.getYears());
		System.out.println("months is : " + p.getMonths());
		System.out.println("days is : " + p.getDays());
		System.out.printf("Age is %d year %d month %d days ", p.getYears(), p.getMonths(), p.getDays());

	}

}
