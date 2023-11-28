package com.corejava.oops;

public class Client {

	public static void main(String[] args) {
		EmployeeEncapsulation emp = new EmployeeEncapsulation();
		emp.setEmpId(120);
		emp.setEmpName("Gouthami");
		emp.setEmpSal(50000);
		emp.setEmpDesg("Trainer");
		System.out.println(emp.toString());
		System.out.println(emp.getEmpId());

		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpSal());
		System.out.println(emp.getEmpDesg());
	}

}
