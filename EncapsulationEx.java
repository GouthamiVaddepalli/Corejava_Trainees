package com.corejava.oops;

class Student{
	
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class EncapsulationEx {

	public static void main(String[] args) {
		Student st = new Student();
		
		st.setName("Gouthami");
		System.out.println(st.getName());
		
		

	}

	

}
